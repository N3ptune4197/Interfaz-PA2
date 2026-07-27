package capa_datos;

import capa_logica.Material;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MaterialDAO {

    private static final Path archivo =
            Paths.get("src//misArchivos//materiales.bin");

    public static void agregar(Material obj) throws Exception {

        try {

            ArrayList<Material> lista = consultarTodos();

            lista.add(obj);

            ObjectOutputStream salida =
                    new ObjectOutputStream(
                            new FileOutputStream(archivo.toFile()));

            salida.writeObject(lista);

            salida.close();

        } catch (Exception ex) {

            throw new Exception(ex.getMessage());

        }

    }

    public static void modificar(Material objNuevo) throws Exception {

        ArrayList<Material> lista = consultarTodos();

        try {

            for (int i = 0; i < lista.size(); i++) {

                if (lista.get(i).getCodigo().equals(objNuevo.getCodigo())) {

                    lista.set(i, objNuevo);
                    break;

                }

            }

            ObjectOutputStream salida =
                    new ObjectOutputStream(
                            new FileOutputStream(archivo.toFile()));

            salida.writeObject(lista);

            salida.close();

        } catch (Exception ex) {

            throw new Exception(ex.getMessage());

        }

    }

    public static void borrar(String codigo) throws Exception {

        ArrayList<Material> lista = consultarTodos();

        try {

            lista.removeIf(m -> m.getCodigo().equals(codigo));

            ObjectOutputStream salida =
                    new ObjectOutputStream(
                            new FileOutputStream(archivo.toFile()));

            salida.writeObject(lista);

            salida.close();

        } catch (Exception ex) {

            throw new Exception(ex.getMessage());

        }

    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Material> consultarTodos() throws Exception {

        ArrayList<Material> lista = new ArrayList<>();

        if (Files.exists(archivo)) {

            try {

                ObjectInputStream entrada =
                        new ObjectInputStream(
                                new FileInputStream(archivo.toFile()));

                lista = (ArrayList<Material>) entrada.readObject();

                entrada.close();

            } catch (Exception ex) {

                throw new Exception(ex.getMessage());

            }

        }

        return lista;

    }

    public static Material consultarPorCodigo(String codigo) throws Exception {

        for (Material obj : consultarTodos()) {

            if (obj.getCodigo().equals(codigo)) {

                return obj;

            }

        }

        return null;

    }

}