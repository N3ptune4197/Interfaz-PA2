package capa_datos;

import capa_logica.Proyecto;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ProyectoDAO {

    private static final Path archivo =
            Paths.get("src//misArchivos//proyectos.bin");

    public static void agregar(Proyecto obj) throws Exception {

        try {

            ArrayList<Proyecto> lista = consultarTodos();

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

    public static void modificar(Proyecto objNuevo) throws Exception {

        ArrayList<Proyecto> lista = consultarTodos();

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

        ArrayList<Proyecto> lista = consultarTodos();

        try {

            lista.removeIf(p -> p.getCodigo().equals(codigo));

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
    public static ArrayList<Proyecto> consultarTodos() throws Exception {

        ArrayList<Proyecto> lista = new ArrayList<>();

        if (Files.exists(archivo)) {

            try {

                ObjectInputStream entrada =
                        new ObjectInputStream(
                                new FileInputStream(archivo.toFile()));

                lista = (ArrayList<Proyecto>) entrada.readObject();

                entrada.close();

            } catch (Exception ex) {

                throw new Exception(ex.getMessage());

            }

        }

        return lista;

    }

    public static Proyecto consultarPorCodigo(String codigo) throws Exception {

        for (Proyecto obj : consultarTodos()) {

            if (obj.getCodigo().equals(codigo)) {

                return obj;

            }

        }

        return null;

    }

}