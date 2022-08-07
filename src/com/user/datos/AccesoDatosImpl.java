
package com.user.datos;

import com.user.domain.Gerente;
import com.user.domain.Recepcionista;
import com.user.domain.Mantenimiento;
import com.user.domain.Vendedor;
import com.user.domain.Mecanico;
import com.user.domain.Agencia;
import com.user.domain.CaracteristicasTec;
import com.user.domain.Distribuidor;
import com.user.domain.Marca;
import com.user.domain.Modelo;
import com.user.domain.Taller;
import com.user.exceptions.AccesoDatosEx;
import com.user.negocios.IAccionesComerciales;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_MARCAS;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_MODELOS;
import java.io.*;
import java.util.*;


public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        switch (nombreArchivo) {
            case ARCHIVO_MARCAS -> {
                try {
                    PrintWriter createFile = new PrintWriter(new FileWriter(archivo));
                    System.out.println("Se ha creado el archivo " + nombreArchivo + "!");
                    createFile.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al crear el archivo marcas!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_MODELOS -> {
                try {
                    PrintWriter createFile = new PrintWriter(new FileWriter(archivo));
                    System.out.println("Se ha modificado el archivo " + nombreArchivo + "!");
                    createFile.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al crear el archivo modelos!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_CARACTERISTICAS_TEC -> {
                try {
                    PrintWriter createFile = new PrintWriter(new FileWriter(archivo));
                    System.out.println("Se ha creado el archivo " + nombreArchivo + "!");
                    createFile.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al crear el archivo caracteristicas tecnicas!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_DISTRIBUIDORES -> {
                try {
                    PrintWriter createFile = new PrintWriter(new FileWriter(archivo));
                    System.out.println("Se ha creado el archivo " + nombreArchivo + "!");
                    createFile.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al crear el archivo distribuidores!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_AGENCIAS -> {
                try {
                    PrintWriter createFile = new PrintWriter(new FileWriter(archivo));
                    System.out.println("Se ha creado el archivo " + nombreArchivo + "!");
                    createFile.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al crear el archivo agencias!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_GERENTES -> {
                try {
                    PrintWriter createFile = new PrintWriter(new FileWriter(archivo));
                    System.out.println("Se ha creado el archivo " + nombreArchivo + "!");
                    createFile.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al crear el archivo gerentes!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_VENDEDORES -> {
                try {
                    PrintWriter createFile = new PrintWriter(new FileWriter(archivo));
                    System.out.println("Se ha creado el archivo " + nombreArchivo + "!");
                    createFile.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al crear el archivo vendedores!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_RECEPCIONISTAS -> {
                try {
                    PrintWriter createFile = new PrintWriter(new FileWriter(archivo));
                    System.out.println("Se ha creado el archivo " + nombreArchivo + "!");
                    createFile.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al crear el archivo recepcionistas!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_MANTENIMIENTO -> {
                try {
                    PrintWriter createFile = new PrintWriter(new FileWriter(archivo));
                    System.out.println("Se ha creado el archivo " + nombreArchivo + "!");
                    createFile.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al crear el archivo mantenimiento!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_MECANICOS -> {
                try {
                    PrintWriter createFile = new PrintWriter(new FileWriter(archivo));
                    System.out.println("Se ha creado el archivo " + nombreArchivo + "!");
                    createFile.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al crear el archivo mecanicos!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_TALLER -> {
                try {
                    PrintWriter createFile = new PrintWriter(new FileWriter(archivo));
                    System.out.println("Se ha creado el archivo " + nombreArchivo + "!");
                    createFile.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al crear el archivo mecanicos!" + ex.getMessage());
                }
            }
            default -> {
            }
        }
    }

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public void escribir(Object object, String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        switch (nombreArchivo) {
            case ARCHIVO_MARCAS -> {
                Marca marca = (Marca) object;
                try {
                    PrintWriter write = new PrintWriter(new FileWriter(archivo, true));
                    write.println(marca.toString());
                    write.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al escribir en el archivo marcas!" + ex.getMessage());
                }
            }
            case ARCHIVO_MODELOS -> {
                Modelo modelo = (Modelo) object;
                try {
                    PrintWriter write = new PrintWriter(new FileWriter(archivo, true));
                    write.println(modelo.toString());
                    write.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al escribir en el archivo modelos!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_CARACTERISTICAS_TEC -> {
                CaracteristicasTec caracteristica = (CaracteristicasTec) object;
                try {
                    PrintWriter write = new PrintWriter(new FileWriter(archivo, true));
                    write.println(caracteristica.toString());
                    write.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al escribir en el archivo caracteristicas tecnicas!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_DISTRIBUIDORES -> {
                Distribuidor distribuidor = (Distribuidor) object;
                try {
                    PrintWriter write = new PrintWriter(new FileWriter(archivo, true));
                    write.println(distribuidor.toString());
                    write.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al escribir en el archivo distribuidor!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_AGENCIAS -> {
                Agencia agencia = (Agencia) object;
                try {
                    PrintWriter write = new PrintWriter(new FileWriter(archivo, true));
                    write.println(agencia.toString());
                    write.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al escribir en el archivo agencia!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_GERENTES -> {
                Gerente gerente = (Gerente) object;
                try {
                    PrintWriter write = new PrintWriter(new FileWriter(archivo, true));
                    write.println(gerente.toString());
                    write.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al escribir en el archivo gerentes!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_VENDEDORES -> {
                Vendedor vendedor = (Vendedor) object;
                try {
                    PrintWriter write = new PrintWriter(new FileWriter(archivo, true));
                    write.println(vendedor.toString());
                    write.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al escribir en el archivo vendedores!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_RECEPCIONISTAS -> {
                Recepcionista recepcionista = (Recepcionista) object;
                try {
                    PrintWriter write = new PrintWriter(new FileWriter(archivo, true));
                    write.println(recepcionista.toString());
                    write.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al escribir en el archivo recepcionista!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_MANTENIMIENTO -> {
                Mantenimiento mantenimiento = (Mantenimiento) object;
                try {
                    PrintWriter write = new PrintWriter(new FileWriter(archivo, true));
                    write.println(mantenimiento.toString());
                    write.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al escribir en el archivo mantenimiento!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_MECANICOS -> {
                Mecanico mecanico = (Mecanico) object;
                try {
                    PrintWriter write = new PrintWriter(new FileWriter(archivo, true));
                    write.println(mecanico.toString());
                    write.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al escribir en el archivo mecanicos!" + ex.getMessage());
                }
            }
            case IAccionesComerciales.ARCHIVO_TALLER -> {
                Taller taller = (Taller) object;
                try {
                    PrintWriter write = new PrintWriter(new FileWriter(archivo, true));
                    write.println(taller.toString());
                    write.close();
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al escribir en el archivo taller!" + ex.getMessage());
                }
            }
            default -> {
                System.out.println("La opcion ingresada no exitste, ingrese una opcion valida!");
            }
        }
    }

    public void modificarDatoEnArchivo(String nombreArchivo, List object) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        switch(nombreArchivo){
                case ARCHIVO_MARCAS -> {
                this.borrar(ARCHIVO_MARCAS);
                this.crear(ARCHIVO_MARCAS);
                for (int i = 0; i < object.size(); i++) {
                    this.escribir(object.get(i), ARCHIVO_MARCAS);
                }
            }
            case ARCHIVO_MODELOS -> {
                this.borrar(ARCHIVO_MODELOS);
                this.crear(ARCHIVO_MODELOS);
                for (int i = 0; i < object.size(); i++) {
                    this.escribir(object.get(i), ARCHIVO_MODELOS);
                }
            }
            case IAccionesComerciales.ARCHIVO_CARACTERISTICAS_TEC -> {
                this.borrar(IAccionesComerciales.ARCHIVO_CARACTERISTICAS_TEC);
                this.crear(IAccionesComerciales.ARCHIVO_CARACTERISTICAS_TEC);
                for (int i = 0; i < object.size(); i++) {
                    this.escribir(object.get(i), IAccionesComerciales.ARCHIVO_CARACTERISTICAS_TEC);
                }
            }
            case IAccionesComerciales.ARCHIVO_DISTRIBUIDORES -> {
                this.borrar(IAccionesComerciales.ARCHIVO_DISTRIBUIDORES);
                this.crear(IAccionesComerciales.ARCHIVO_DISTRIBUIDORES);
                for (int i = 0; i < object.size(); i++) {
                    this.escribir(object.get(i), IAccionesComerciales.ARCHIVO_DISTRIBUIDORES);
                }
            }
            case IAccionesComerciales.ARCHIVO_AGENCIAS -> {
                this.borrar(IAccionesComerciales.ARCHIVO_AGENCIAS);
                this.crear(IAccionesComerciales.ARCHIVO_AGENCIAS);
                for (int i = 0; i < object.size(); i++) {
                    this.escribir(object.get(i), IAccionesComerciales.ARCHIVO_AGENCIAS);
                }
            }

            case IAccionesComerciales.ARCHIVO_GERENTES -> {
                this.borrar(IAccionesComerciales.ARCHIVO_GERENTES);
                this.crear(IAccionesComerciales.ARCHIVO_GERENTES);
                for (int i = 0; i < object.size(); i++) {
                    this.escribir(object.get(i), IAccionesComerciales.ARCHIVO_GERENTES);
                }
            }
            case IAccionesComerciales.ARCHIVO_VENDEDORES -> {
                this.borrar(IAccionesComerciales.ARCHIVO_VENDEDORES);
                this.crear(IAccionesComerciales.ARCHIVO_VENDEDORES);
                for (int i = 0; i < object.size(); i++) {
                    this.escribir(object.get(i), IAccionesComerciales.ARCHIVO_VENDEDORES);
                }
            }
            case IAccionesComerciales.ARCHIVO_RECEPCIONISTAS -> {
                this.borrar(IAccionesComerciales.ARCHIVO_RECEPCIONISTAS);
                this.crear(IAccionesComerciales.ARCHIVO_RECEPCIONISTAS);
                for (int i = 0; i < object.size(); i++) {
                    this.escribir(object.get(i), IAccionesComerciales.ARCHIVO_RECEPCIONISTAS);
                }
            }
            case IAccionesComerciales.ARCHIVO_MANTENIMIENTO -> {
                this.borrar(IAccionesComerciales.ARCHIVO_MANTENIMIENTO);
                this.crear(IAccionesComerciales.ARCHIVO_MANTENIMIENTO);
                for (int i = 0; i < object.size(); i++) {
                    this.escribir(object.get(i), IAccionesComerciales.ARCHIVO_MANTENIMIENTO);
                }
            }
            case IAccionesComerciales.ARCHIVO_MECANICOS -> {
                this.borrar(IAccionesComerciales.ARCHIVO_MECANICOS);
                this.crear(IAccionesComerciales.ARCHIVO_MECANICOS);
                for (int i = 0; i < object.size(); i++) {
                    this.escribir(object.get(i), IAccionesComerciales.ARCHIVO_MECANICOS);
                }
            }
            case IAccionesComerciales.ARCHIVO_TALLER -> {
                this.borrar(IAccionesComerciales.ARCHIVO_TALLER);
                this.crear(IAccionesComerciales.ARCHIVO_TALLER);
                for (int i = 0; i < object.size(); i++) {
                    this.escribir(object.get(i), IAccionesComerciales.ARCHIVO_TALLER);
                }
            }
        }
    }

    @Override
    public List listar(Object object, String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        switch (nombreArchivo) {
            case ARCHIVO_MARCAS -> {
                List<Marca> marcas = new ArrayList<>();
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(archivo));
                    String linea = leer.readLine();
                    while (linea != null) {
                        linea = linea.substring(16);
                        String nombre = linea.substring(0, linea.indexOf(" | "));
                        String origen = linea.substring(linea.indexOf("Origen:") + 8, linea.indexOf(" | Logo:"));
                        String logo = linea.substring(linea.indexOf("Logo:") + 6, linea.indexOf(" -"));
                        Marca marca = new Marca(nombre, origen, logo);
                        marcas.add(marca);
                        linea = leer.readLine();
                    }
                    leer.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo marcas!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo marcas!" + ex.getMessage());
                }
                return marcas;
            }
            case IAccionesComerciales.ARCHIVO_MODELOS -> {
                List<Modelo> modelos = new ArrayList<>();
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(archivo));
                    String linea = leer.readLine();
                    while (linea != null) {
                        linea = linea.substring(7);
                        String nombreMarca = linea.substring(0, linea.indexOf(" | "));
                        String denominacion = linea.substring(linea.indexOf("Denominacion:") + 14, linea.indexOf(" | Tipo de Vehiculo:"));
                        String tipoVehiculo = linea.substring(linea.indexOf("Tipo de Vehiculo:") + 18, linea.indexOf(" | Cantidad:"));
                        String cantidad = linea.substring(linea.indexOf("Cantidad:") + 10, linea.indexOf(" -"));
                        Modelo modelo = new Modelo(nombreMarca, denominacion, tipoVehiculo, Integer.valueOf(cantidad));
                        modelos.add(modelo);
                        linea = leer.readLine();
                    }
                    leer.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo modelos!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo modelos!" + ex.getMessage());
                }
                return modelos;
            }
            case IAccionesComerciales.ARCHIVO_CARACTERISTICAS_TEC -> {
                List<CaracteristicasTec> caracteristicas = new ArrayList<>();
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(archivo));
                    String linea = leer.readLine();
                    while (linea != null) {
                        linea = linea.substring(8);
                        String modeloDenominacion = linea.substring(0, linea.indexOf(" | "));
                        String tipoMotor = linea.substring(linea.indexOf("TipoMotor:") + 11, linea.indexOf(" | Cilindros:"));
                        String cilindros = linea.substring(linea.indexOf("Cilindros:") + 11, linea.indexOf(" | Cilindrada"));
                        String cilindrada = linea.substring(linea.indexOf("Cilindrada:") + 12, linea.indexOf(" | HP"));
                        String hp = linea.substring(linea.indexOf("HP:") + 4, linea.indexOf(" | Caja"));
                        String caja = linea.substring(linea.indexOf("Caja:") + 6, linea.indexOf(" | Equipamiento:"));
                        String equipamiento = linea.substring(linea.indexOf("Equipamiento:") + 14, linea.indexOf(" | Carroceria"));
                        String carroceria = linea.substring(linea.indexOf("Carroceria:") + 12, linea.indexOf(" | id"));
                        String id = linea.substring(linea.indexOf("id:") + 4, linea.indexOf(" -"));
                        CaracteristicasTec caracteristica = new CaracteristicasTec(modeloDenominacion, tipoMotor, cilindros, Integer.valueOf(cilindrada),
                                Integer.valueOf(hp), caja, equipamiento, carroceria, id);
                        caracteristicas.add(caracteristica);
                        linea = leer.readLine();
                    }
                    leer.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo marcas!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo marcas!" + ex.getMessage());
                }
                return caracteristicas;
            }
            case IAccionesComerciales.ARCHIVO_DISTRIBUIDORES -> {
                List<Distribuidor> distribuidores = new ArrayList<>();
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(archivo));
                    String linea = leer.readLine();
                    while (linea != null) {
                        linea = linea.substring(23);
                        String nombreDistribuidor = linea.substring(0, linea.indexOf(" | "));
                        String pais = linea.substring(linea.indexOf("Pais:") + 6, linea.indexOf(" | Marca Distribuida:"));
                        String marcaDistribuida = linea.substring(linea.indexOf("Marca Distribuida:") + 19, linea.indexOf(" -"));
                        Distribuidor distribuidor = new Distribuidor(nombreDistribuidor, pais, marcaDistribuida);
                        distribuidores.add(distribuidor);
                        linea = leer.readLine();
                    }
                    leer.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo marcas!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo marcas!" + ex.getMessage());
                }
                return distribuidores;
            }
            case IAccionesComerciales.ARCHIVO_AGENCIAS -> {
                List<Agencia> agencias = new ArrayList<>();
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(archivo));
                    String linea = leer.readLine();
                    while (linea != null) {
                        linea = linea.substring(8);
                        String nombreAgencia = linea.substring(0, linea.indexOf(" | "));
                        String ciudad = linea.substring(linea.indexOf("Ciudad:") + 8, linea.indexOf(" | Marca:"));
                        String marcaComerzializada = linea.substring(linea.indexOf("Marca:") + 7, linea.indexOf(" -"));
                        Agencia agencia = new Agencia(nombreAgencia, ciudad, marcaComerzializada);
                        agencias.add(agencia);
                        linea = leer.readLine();
                    }
                    leer.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo marcas!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo marcas!" + ex.getMessage());
                }
                return agencias;
            }
            case IAccionesComerciales.ARCHIVO_GERENTES -> {
                List<Gerente> gerentes = new ArrayList<>();
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(archivo));
                    String linea = leer.readLine();
                    while (linea != null) {
                        linea = linea.substring(16);
                        String area = linea.substring(0, linea.indexOf(" | "));
                        String estudios = linea.substring(linea.indexOf("Estudios:") + 10, linea.indexOf(" | Nombre:"));
                        String nombre = linea.substring(linea.indexOf("Nombre:") + 8, linea.indexOf(" | Apellido:"));
                        String apellido = linea.substring(linea.indexOf("Apellido:") + 10, linea.indexOf(" | DNI:"));
                        String dni = linea.substring(linea.indexOf("DNI:") + 5, linea.indexOf(" | Edad:"));
                        String edad = linea.substring(linea.indexOf("Edad:") + 6, linea.indexOf(" -"));
                        Gerente gerente = new Gerente(area, estudios, nombre, apellido, Integer.valueOf(dni), Integer.valueOf(edad));
                        gerentes.add(gerente);
                        linea = leer.readLine();
                    }
                    leer.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo gerentes!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo gerentes!" + ex.getMessage());
                }
                return gerentes;
            }
            case IAccionesComerciales.ARCHIVO_VENDEDORES -> {
                List<Vendedor> vendedores = new ArrayList<>();
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(archivo));
                    String linea = leer.readLine();
//                    Vendedor | Area: Vehiculos comerciales | Formacion: Lic | Nombre: Juan | Apellido: Perez | DNI: 5423 | Edad: 26 -
                    while (linea != null) {
                        linea = linea.substring(17);
                        String area = linea.substring(0, linea.indexOf(" | "));
                        String formacion = linea.substring(linea.indexOf("Formacion:") + 11, linea.indexOf(" | Nombre:"));
                        String nombre = linea.substring(linea.indexOf("Nombre:") + 8, linea.indexOf(" | Apellido:"));
                        String apellido = linea.substring(linea.indexOf("Apellido:") + 10, linea.indexOf(" | DNI:"));
                        String dni = linea.substring(linea.indexOf("DNI:") + 5, linea.indexOf(" | Edad:"));
                        String edad = linea.substring(linea.indexOf("Edad:") + 6, linea.indexOf(" -"));
                        Vendedor vendedor = new Vendedor(area, formacion, nombre, apellido, Integer.valueOf(dni), Integer.valueOf(edad));
                        vendedores.add(vendedor);
                        linea = leer.readLine();
                    }
                    leer.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo vendedores!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo vendedores!" + ex.getMessage());
                }
                return vendedores;
            }
            case IAccionesComerciales.ARCHIVO_RECEPCIONISTAS -> {
                List<Recepcionista> recepcionistas = new ArrayList<>();
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(archivo));
                    String linea = leer.readLine();
                    while (linea != null) {
                        linea = linea.substring(27);
                        String formacion = linea.substring(0, linea.indexOf(" | "));
                        String nombre = linea.substring(linea.indexOf("Nombre:") + 8, linea.indexOf(" | Apellido:"));
                        String apellido = linea.substring(linea.indexOf("Apellido:") + 10, linea.indexOf(" | DNI:"));
                        String dni = linea.substring(linea.indexOf("DNI:") + 5, linea.indexOf(" | Edad:"));
                        String edad = linea.substring(linea.indexOf("Edad:") + 6, linea.indexOf(" -"));
                        Recepcionista recepcionista = new Recepcionista(formacion, nombre, apellido, Integer.valueOf(dni), Integer.valueOf(edad));
                        recepcionistas.add(recepcionista);
                        linea = leer.readLine();
                    }
                    leer.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo recepcionistas!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo recepcionistas!" + ex.getMessage());
                }
                return recepcionistas;
            }
            case IAccionesComerciales.ARCHIVO_MECANICOS -> {
                List<Mecanico> mecanicos = new ArrayList<>();
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(archivo));
                    String linea = leer.readLine();
                    while (linea != null) {
                        linea = linea.substring(25);
                        String especialidad = linea.substring(0, linea.indexOf(" | "));
                        String formacion = linea.substring(linea.indexOf("Formacion:") + 11, linea.indexOf(" | Nombre:"));
                        String nombre = linea.substring(linea.indexOf("Nombre:") + 8, linea.indexOf(" | Apellido:"));
                        String apellido = linea.substring(linea.indexOf("Apellido:") + 10, linea.indexOf(" | DNI:"));
                        String dni = linea.substring(linea.indexOf("DNI:") + 5, linea.indexOf(" | Edad:"));
                        String edad = linea.substring(linea.indexOf("Edad:") + 6, linea.indexOf(" -"));
                        Mecanico mecanico = new Mecanico(especialidad, formacion, nombre, apellido, Integer.valueOf(dni), Integer.valueOf(edad));
                        mecanicos.add(mecanico);
                        linea = leer.readLine();
                    }
                    leer.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo mecanicos!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo mecanicos!" + ex.getMessage());
                }
                return mecanicos;
            }
            case IAccionesComerciales.ARCHIVO_MANTENIMIENTO -> {
                List<Mantenimiento> operarios = new ArrayList<>();
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(archivo));
                    String linea = leer.readLine();
                    while (linea != null) {
                        linea = linea.substring(22);
                        String area = linea.substring(0, linea.indexOf(" | "));
                        String formacion = linea.substring(linea.indexOf("Formacion:") + 11, linea.indexOf(" | Nombre:"));
                        String nombre = linea.substring(linea.indexOf("Nombre:") + 8, linea.indexOf(" | Apellido:"));
                        String apellido = linea.substring(linea.indexOf("Apellido:") + 10, linea.indexOf(" | DNI:"));
                        String dni = linea.substring(linea.indexOf("DNI:") + 5, linea.indexOf(" | Edad:"));
                        String edad = linea.substring(linea.indexOf("Edad:") + 6, linea.indexOf(" -"));
                        Mantenimiento operario = new Mantenimiento(area, formacion, nombre, apellido, Integer.valueOf(dni), Integer.valueOf(edad));
                        operarios.add(operario);
                        linea = leer.readLine();
                    }
                    leer.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo mantenimiento!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo mantenimiento!" + ex.getMessage());
                }
                return operarios;
            }
            case IAccionesComerciales.ARCHIVO_TALLER -> {
                List<Taller> talleres = new ArrayList<>();
                try {
                    BufferedReader leer = new BufferedReader(new FileReader(archivo));
                    String linea = leer.readLine();
                    while (linea != null) {
                        linea = linea.substring(9);
                        String especialidad = linea.substring(0, linea.indexOf(" | "));
                        String Ciudad = linea.substring(linea.indexOf("Ciudad:") + 8, linea.indexOf(" -"));
                        Taller taller = new Taller(especialidad, Ciudad);
                        talleres.add(taller);
                        linea = leer.readLine();
                    }
                    leer.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo taller!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al listar el archivo taller!" + ex.getMessage());
                }
                return talleres;
            }
            default -> {
            }
        }
        return (List) object;
    }

    @Override
    public Object buscar(String nombreArchivo, Object object) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        switch (nombreArchivo) {
            case ARCHIVO_MARCAS -> {
                Marca marca = (Marca) object;
                try {
                    BufferedReader search = new BufferedReader(new FileReader(archivo));
                    var indice = 1;
                    String linea = search.readLine();
                    boolean encontrado = false;
                    while (linea != null) {
                        linea = linea.substring(16);
                        String nombre = linea.substring(0, linea.indexOf(" | "));
                        String origen = linea.substring(linea.indexOf("Origen:") + 8, linea.indexOf(" | Logo"));
                        String logo = linea.substring(linea.indexOf("Logo:") + 6, linea.indexOf(" -"));
                        Marca datos = new Marca(nombre, origen, logo);
                        if (marca.getNombre() != null && marca.getNombre().equalsIgnoreCase(datos.getNombre())) {
                            object = "La marca " + marca.getNombre() + " se encuentra en el indice "
                                    + indice + " es de origen " + datos.getOrigen() + " y el logo es " + datos.getLogo();
                            encontrado = true;
                            break;
                        }
                        indice++;
                        linea = search.readLine();
                    }
                    if (marca.getNombre() == null || encontrado == false) {
                        System.out.println("La marca indicada no esta registrada en este archivo o no existe!, Si desea buscar otra marca inicie nuevamente la busqueda");
                    }
                    search.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo marcas!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo marcas!" + ex.getMessage());
                }
                return object;
            }
            case IAccionesComerciales.ARCHIVO_MODELOS -> {
                Modelo modelo = (Modelo) object;
                try {
                    BufferedReader search = new BufferedReader(new FileReader(archivo));
                    var indice = 1;
                    String linea = search.readLine();
                    boolean encontrado = false;
                    while (linea != null) {
                        linea = linea.substring(7);
                        String nombreMarca = linea.substring(0, linea.indexOf(" | "));
                        String denominacion = linea.substring(linea.indexOf("Denominacion:") + 14, linea.indexOf(" | Tipo de Vehiculo:"));
                        String tipoVehiculo = linea.substring(linea.indexOf("Tipo de Vehiculo:") + 18, linea.indexOf(" | Cantidad:"));
                        String cantidad = linea.substring(linea.indexOf("Cantidad:") + 10, linea.indexOf(" -"));
                        Modelo datos = new Modelo(nombreMarca, denominacion, tipoVehiculo, Integer.valueOf(cantidad));
                        if (modelo.getDenominacion() != null && modelo.getDenominacion().equalsIgnoreCase(datos.getDenominacion())) {
                            object = "Se ha localizado el modelo " + datos.getDenominacion() + " en el indice "
                                    + indice + " y hay en stock " + datos.getCantidad() + " unidades";
                            encontrado = true;
                            break;
                        }
                        indice++;
                        linea = search.readLine();
                    }
                    if (modelo.getDenominacion() == null || encontrado == false) {
                        System.out.println("El modelo indicado no esta registrada en este achivo o no existe!, Si desea buscar otro modelo inicie nuevamente la busqueda");
                    }
                    search.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo modelos!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo modelos!" + ex.getMessage());
                }
                return object;
            }
            case IAccionesComerciales.ARCHIVO_CARACTERISTICAS_TEC -> {
                CaracteristicasTec caracteristica = (CaracteristicasTec) object;
                try {
                    BufferedReader search = new BufferedReader(new FileReader(archivo));
                    var indice = 1;
                    String linea = search.readLine();
                    boolean encontrado = false;
                    while (linea != null) {
                        linea = linea.substring(8);
                        String modeloDenominacion = linea.substring(0, linea.indexOf(" "));
                        String tipoMotor = linea.substring(linea.indexOf("TipoMotor:") + 11, linea.indexOf(" | Cilindros:"));
                        String cilindros = linea.substring(linea.indexOf("Cilindros:") + 11, linea.indexOf(" | Cilindrada:"));
                        String cilindrada = linea.substring(linea.indexOf("Cilindrada:") + 12, linea.indexOf(" | HP:"));
                        String HP = linea.substring(linea.indexOf("HP:") + 4, linea.indexOf(" | Caja:"));
                        String caja = linea.substring(linea.indexOf("Caja:") + 6, linea.indexOf(" | Equipamiento:"));
                        String equipamiento = linea.substring(linea.indexOf("Equipamiento:") + 14, linea.indexOf(" | Carroceria:"));
                        String carroceria = linea.substring(linea.indexOf("Carroceria:") + 12, linea.indexOf(" | id:"));
                        String id = linea.substring(linea.indexOf("id:") + 4, linea.indexOf(" -"));
                        CaracteristicasTec detalle = new CaracteristicasTec(modeloDenominacion, tipoMotor, cilindros, Integer.valueOf(cilindrada), Integer.valueOf(HP), caja, equipamiento, carroceria, id);
                        if (caracteristica.getModeloDenominacion() != null && caracteristica.getModeloDenominacion().equalsIgnoreCase(detalle.getModeloDenominacion())) {
                            object = "El modelo " + caracteristica.getModeloDenominacion() + " que se encuentra en el indice " + indice + " tiene las siguientes caracteristicas: "
                                    + detalle.getTipoMotor() + " | "
                                    + detalle.getCilindros() + " | "
                                    + detalle.getCilindrada() + " | "
                                    + detalle.getHP() + " | "
                                    + detalle.getCaja() + " | "
                                    + detalle.getEquipamiento() + " | "
                                    + detalle.getCarroceria() + " | "
                                    + detalle.getId();
                            encontrado = true;
                            break;
                        }
                        indice++;
                        linea = search.readLine();
                    }
                    if (caracteristica.getModeloDenominacion() == null || encontrado == false) {
                        System.out.println("El modelo indicado esta registrado en este archivo o no existe!, Si desea buscar otro modelo ingreselo nuevamente");
                    }
                    search.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo caracteristicas tecnicas!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo caracteristicas tecnicas!" + ex.getMessage());
                }
                return object;
            }
            case IAccionesComerciales.ARCHIVO_DISTRIBUIDORES -> {
                Distribuidor distribuidor = (Distribuidor) object;
                try {
                    BufferedReader search = new BufferedReader(new FileReader(archivo));
                    var indice = 1;
                    String linea = search.readLine();
                    boolean encontrado = false;
                    while (linea != null) {
                        linea = linea.substring(23);
                        String nombreDistribuidor = linea.substring(0, linea.indexOf(" | "));
                        String pais = linea.substring(linea.indexOf("Pais:") + 6, linea.indexOf(" | Marca Distribuida:"));
                        String marcaDistribuida = linea.substring(linea.indexOf("Marca Distribuida:") + 19, linea.indexOf(" -"));
                        Distribuidor datos = new Distribuidor(nombreDistribuidor, pais, marcaDistribuida);
                        if (distribuidor.getNombreDistribuidor() != null && distribuidor.getNombreDistribuidor().equalsIgnoreCase(datos.getNombreDistribuidor())) {
                            object = "El distribuidor " + distribuidor.getNombreDistribuidor() + " se encuentra en el indice " + indice + " y se localiza en " + datos.getPais();
                            encontrado = true;
                            break;
                        }
                        indice++;
                        linea = search.readLine();
                    }
                    if (distribuidor.getNombreDistribuidor() == null || encontrado == false) {
                        System.out.println("El distribuidor indicado no esta registrado en este archivo o no existe!, Si desea buscar otro distribuidor inicie nuevamente la busqueda");
                    }
                    search.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo distribuidores!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo distribuidores!" + ex.getMessage());
                }
                return object;
            }
            case IAccionesComerciales.ARCHIVO_AGENCIAS -> {
                Agencia agencia = (Agencia) object;
                try {
                    BufferedReader search = new BufferedReader(new FileReader(archivo));
                    var indice = 1;
                    String linea = search.readLine();
                    boolean encontrado = false;
                    while (linea != null) {
                        linea = linea.substring(18);
                        String nombreAgencia = linea.substring(0, linea.indexOf(" | "));
                        String ciudad = linea.substring(linea.indexOf("Ciudad:") + 8, linea.indexOf(" | Marca:"));
                        String marcaComercializada = linea.substring(linea.indexOf("Marca:") + 7, linea.indexOf(" -"));
                        Agencia datos = new Agencia(nombreAgencia, ciudad, marcaComercializada);
                        if (agencia.getNombreAgencia() != null && agencia.getNombreAgencia().equalsIgnoreCase(datos.getNombreAgencia())) {
                            object = "La agencia " + datos.getNombreAgencia() + " que se encuentra en el indice "
                                    + indice + ", se localiza en la ciudad de " + datos.getCiudad()
                                    + " y comercializa la marca " + datos.getMarcaComercializada();
                            encontrado = true;
                            break;
                        }
                        indice++;
                        linea = search.readLine();
                    }
                    if (agencia.getNombreAgencia() == null || encontrado == false) {
                        System.out.println("La agencia indicada no esta registrada en este archivo o no existe!, Si desea buscar otra agencia inicie nuevamente la busqueda");
                    }
                    search.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo agencias!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo agencias!" + ex.getMessage());
                }
                return object;
            }
            case IAccionesComerciales.ARCHIVO_GERENTES -> {
                Gerente gerente = (Gerente) object;
                try {
                    BufferedReader search = new BufferedReader(new FileReader(archivo));
                    var indice = 1;
                    String linea = search.readLine();
                    boolean encontrado = false;
                    while (linea != null) {
                        linea = linea.substring(16);
                        String area = linea.substring(0, linea.indexOf(" | "));
                        String estudios = linea.substring(linea.indexOf("Estudios:") + 10, linea.indexOf(" | Nombre:"));
                        String nombre = linea.substring(linea.indexOf("Nombre:") + 8, linea.indexOf(" | Apellido:"));
                        String apellido = linea.substring(linea.indexOf("Apellido:") + 10, linea.indexOf(" | DNI:"));
                        String dni = linea.substring(linea.indexOf("DNI:") + 5, linea.indexOf(" | Edad:"));
                        String edad = linea.substring(linea.indexOf("Edad:") + 6, linea.indexOf(" -"));
                        Gerente datos = new Gerente(area, estudios, nombre, apellido, Integer.valueOf(dni), Integer.valueOf(edad));
                        if (gerente.getNombre()!= null
                            && gerente.getApellido() != null 
                            && gerente.getNombre().equalsIgnoreCase(datos.getNombre())
                            && gerente.getApellido().equalsIgnoreCase(datos.getApellido())) {
                            object = "El gerente " + datos.getNombre() + " " + datos.getApellido() + " que se encuentra en el indice "
                                    + indice + ", se desempeña en el area " + datos.getArea()
                                    + " y su formacion es " + datos.getEstudios();
                            encontrado = true;
                            break;
                        }
                        indice++;
                        linea = search.readLine();
                    }
                    if (gerente.getNombre() == null || gerente.getApellido() == null || encontrado == false) {
                        System.out.println("El gerente requerido no esta registrado en este archivo o no esta entre el personal de la firma!, "
                                         + "Si desea buscar otra agencia inicie nuevamente la busqueda");
                    }
                    search.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo gerentes!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo gerentes!" + ex.getMessage());
                }
                return object;
            }
            case IAccionesComerciales.ARCHIVO_VENDEDORES -> {
                Vendedor vendedor = (Vendedor) object;
                try {
                    BufferedReader search = new BufferedReader(new FileReader(archivo));
                    var indice = 1;
                    String linea = search.readLine();
                    boolean encontrado = false;
                    while (linea != null) {
                        linea = linea.substring(17);
                        String area = linea.substring(0, linea.indexOf(" | "));
                        String formacion = linea.substring(linea.indexOf("Formacion:") + 11, linea.indexOf(" | Nombre:"));
                        String nombre = linea.substring(linea.indexOf("Nombre:") + 8, linea.indexOf(" | Apellido:"));
                        String apellido = linea.substring(linea.indexOf("Apellido:") + 10, linea.indexOf(" | DNI:"));
                        String dni = linea.substring(linea.indexOf("DNI:") + 5, linea.indexOf(" | Edad:"));
                        String edad = linea.substring(linea.indexOf("Edad:") + 6, linea.indexOf(" -"));
                        Vendedor datos = new Vendedor(area, formacion, nombre, apellido, Integer.valueOf(dni), Integer.valueOf(edad));
                        if (vendedor.getNombre()!= null && vendedor.getApellido() != null && vendedor.getNombre().equalsIgnoreCase(datos.getNombre()) 
                            && vendedor.getApellido().equalsIgnoreCase(datos.getApellido())) {
                            object = "El vendedor " + datos.getNombre() + " " + datos.getApellido() + " que se encuentra en el indice "
                                    + indice + ", y su area de desempeño es " + datos.getArea();
                            encontrado = true;
                            break;
                        }
                        indice++;
                        linea = search.readLine();
                    }
                    if (vendedor.getNombre() == null || vendedor.getApellido() == null || encontrado == false) {
                        System.out.println("El vendedor requerido no esta registrado en este archivo o no pertenece a la plantilla de empleados!, "
                                         + "Si desea buscar otro taller inicie nuevamente la busqueda");
                    }
                    search.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo vendedores!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo vendedores!" + ex.getMessage());
                }
                return object;
            }
            case IAccionesComerciales.ARCHIVO_RECEPCIONISTAS -> {
                Recepcionista recepcionista = (Recepcionista) object;
                try {
                    BufferedReader search = new BufferedReader(new FileReader(archivo));
                    var indice = 1;
                    String linea = search.readLine();
                    boolean encontrado = false;
                    while (linea != null) {
                        linea = linea.substring(27);
                        String formacion = linea.substring(0, linea.indexOf(" | "));
                        String nombre = linea.substring(linea.indexOf("Nombre:") + 8, linea.indexOf(" | Apellido:"));
                        String apellido = linea.substring(linea.indexOf("Apellido:") + 10, linea.indexOf(" | DNI:"));
                        String dni = linea.substring(linea.indexOf("DNI:") + 5, linea.indexOf(" | Edad:"));
                        String edad = linea.substring(linea.indexOf("Edad:") + 6, linea.indexOf(" -"));
                        Recepcionista datos = new Recepcionista(formacion, nombre, apellido, Integer.valueOf(dni), Integer.valueOf(edad));
                        if (recepcionista.getNombre()!= null && recepcionista.getApellido() != null 
                            && recepcionista.getNombre().equalsIgnoreCase(datos.getNombre()) 
                            && recepcionista.getApellido().equalsIgnoreCase(datos.getApellido())) {
                            object = "La recepcionista " + datos.getNombre() + " " + datos.getApellido() + " se encuentra en el indice "
                                    + indice + " y su formacion es " + datos.getFormacion();
                            encontrado = true;
                            break;
                        }
                        indice++;
                        linea = search.readLine();
                    }
                    if (recepcionista.getNombre() == null || recepcionista.getApellido() == null || encontrado == false) {
                        System.out.println("La recepcionista requerida no esta registrada en este archivo o no pertenece a la plantilla de empleados!, "
                                         + "Si desea buscar otro taller inicie nuevamente la busqueda");
                    }
                    search.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo recepcionista!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo recepcionista!" + ex.getMessage());
                }
                return object;
            }
            case IAccionesComerciales.ARCHIVO_MECANICOS -> {
                Mecanico mecanico = (Mecanico) object;
                try {
                    BufferedReader search = new BufferedReader(new FileReader(archivo));
                    var indice = 1;
                    String linea = search.readLine();
                    boolean encontrado = false;
                    while (linea != null) {
                        linea = linea.substring(25);
                        String especialidad = linea.substring(0, linea.indexOf(" | "));
                        String formacion = linea.substring(linea.indexOf("Formacion:") + 11, linea.indexOf(" | Nombre:"));
                        String nombre = linea.substring(linea.indexOf("Nombre:") + 8, linea.indexOf(" | Apellido:"));
                        String apellido = linea.substring(linea.indexOf("Apellido:") + 10, linea.indexOf(" | DNI:"));
                        String dni = linea.substring(linea.indexOf("DNI:") + 5, linea.indexOf(" | Edad:"));
                        String edad = linea.substring(linea.indexOf("Edad:") + 6, linea.indexOf(" -"));
                        Mecanico datos = new Mecanico(especialidad, formacion, nombre, apellido, Integer.valueOf(dni), Integer.valueOf(edad));
                        if (mecanico.getNombre()!= null && mecanico.getApellido() != null 
                            && mecanico.getNombre().equalsIgnoreCase(datos.getNombre()) 
                            && mecanico.getApellido().equalsIgnoreCase(datos.getApellido())) {
                            object = "El mecanico " + datos.getNombre() + " " + datos.getApellido() + " que se encuentra en el indice "
                                    + indice + " se especializa en " + datos.getEspecialidad() + " y esta formado como " + datos.getFormacion();
                            encontrado = true;
                            break;
                        }
                        indice++;
                        linea = search.readLine();
                    }
                    if (mecanico.getNombre() == null || mecanico.getApellido() == null || encontrado == false) {
                        System.out.println("El mecanico requerido no esta registrado en este archivo o no pertenece a la plantilla de empleados!,"
                                         + "Si desea buscar otro taller inicie nuevamente la busqueda");
                    }
                    search.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo mecanicos!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo mecanicos!" + ex.getMessage());
                }
                return object;
            }
            case IAccionesComerciales.ARCHIVO_MANTENIMIENTO -> {
                Mantenimiento operario = (Mantenimiento) object;
                try {
                    BufferedReader search = new BufferedReader(new FileReader(archivo));
                    var indice = 1;
                    String linea = search.readLine();
                    boolean encontrado = false;
                    while (linea != null) {
                        linea = linea.substring(22);
                        String area = linea.substring(0, linea.indexOf(" | "));
                        String formacion = linea.substring(linea.indexOf("Formacion:") + 11, linea.indexOf(" | Nombre:"));
                        String nombre = linea.substring(linea.indexOf("Nombre:") + 8, linea.indexOf(" | Apellido:"));
                        String apellido = linea.substring(linea.indexOf("Apellido:") + 10, linea.indexOf(" | DNI:"));
                        String dni = linea.substring(linea.indexOf("DNI:") + 5, linea.indexOf(" | Edad:"));
                        String edad = linea.substring(linea.indexOf("Edad:") + 6, linea.indexOf(" -"));
                        Mantenimiento datos = new Mantenimiento(area, formacion, nombre, apellido, Integer.valueOf(dni), Integer.valueOf(edad));
                        if (operario.getNombre()!= null && operario.getApellido() != null 
                            && operario.getNombre().equalsIgnoreCase(datos.getNombre()) 
                            && operario.getApellido().equalsIgnoreCase(datos.getApellido())) {
                            object = "El operario " + datos.getNombre() + " " + datos.getApellido() + " que se encuentra en el indice "
                                    + indice + " esta afectado al area " + datos.getArea();
                            encontrado = true;
                            break;
                        }
                        indice++;
                        linea = search.readLine();
                    }
                    if (operario.getNombre() == null || operario.getApellido() == null || encontrado == false) {
                        System.out.println("El operario requerido no esta registrado en este archivo o no pertenece a la plantilla de empleados!,"
                                         + "Si desea buscar otro taller inicie nuevamente la busqueda");
                    }
                    search.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo operarios!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo operarios!" + ex.getMessage());
                }
                return object;
            }
            case IAccionesComerciales.ARCHIVO_TALLER -> {
                Taller taller = (Taller) object;
                try {
                    BufferedReader search = new BufferedReader(new FileReader(archivo));
                    var indice = 1;
                    String linea = search.readLine();
                    boolean encontrado = false;
                    while (linea != null) {
                        linea = linea.substring(23);
                        String especialidad = linea.substring(0, linea.indexOf(" | "));
                        String ciudad = linea.substring(linea.indexOf("Ciudad:") + 8, linea.indexOf(" -"));
                        Taller datos = new Taller(especialidad, ciudad);
                        if (taller.getEspecialidad() != null && taller.getEspecialidad().equalsIgnoreCase(datos.getEspecialidad())) {
                            object = "El taller de " + datos.getEspecialidad() + " que se encuentra en el indice "
                                    + indice + ", se localiza en la ciudad de " + datos.getCiudad();
                            encontrado = true;
                            break;
                        }
                        indice++;
                        linea = search.readLine();
                    }
                    if (taller.getEspecialidad() == null || encontrado == false) {
                        System.out.println("El taller indicado no esta registrada en este archivo o no existe!, Si desea buscar otro taller inicie nuevamente la busqueda");
                    }
                    search.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo taller!" + ex.getMessage());
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                    throw new AccesoDatosEx("Error al buscar en el archivo taller!" + ex.getMessage());
                }
                return object;
            }
            default -> {
                System.out.println("La opcion ingresada no exitste, ingrese una opcion valida!");
            }
        }
        return object;
    }
    @Override
    public int buscarIndice(String nombreArchivo, Object object, String modeloDenominacion) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        Modelo modelo = (Modelo) object;
        int indice = 0;
        boolean encontrado = false;
        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            String linea = leer.readLine();
            indice = 1;
            while (linea != null) {
                linea = linea.substring(31);
                        String denominacion = linea.substring(0, linea.indexOf(" | "));
//                        String denominacion = linea.substring(linea.indexOf("Denominacion:") + 14, linea.indexOf(" | Tipo de Vehiculo:"));
//                        String tipoVehiculo = linea.substring(linea.indexOf("Tipo de Vehiculo:") + 18, linea.indexOf(" | Cantidad:"));
//                        String cantidad = linea.substring(linea.indexOf("Cantidad:") + 10, linea.indexOf(" -"));
                Modelo datos = new Modelo(denominacion);
                if (modelo.getDenominacion() != null && modelo.getDenominacion().equalsIgnoreCase(datos.getDenominacion())) {
                    encontrado = true;
                    break;
                }
                indice++;
                linea = leer.readLine();
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new AccesoDatosEx("Error al buscar indice en el archivo modelos!" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new AccesoDatosEx("Error al buscar en el archivo modelos!" + ex.getMessage());
        }
        return indice;
    }

    @Override
    public Integer stockModelo(String nombreArchivo, String denominacionModelo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        int stock = 0;
        boolean existencia = false;
        try {
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            String linea = leer.readLine();
            while (linea != null) {
                linea = linea.substring(7);
                        String nombreMarca = linea.substring(0, linea.indexOf(" | "));
                        String denominacion = linea.substring(linea.indexOf("Denominacion:") + 14, linea.indexOf(" | Tipo de Vehiculo:"));
                        String tipoVehiculo = linea.substring(linea.indexOf("Tipo de Vehiculo:") + 18, linea.indexOf(" | Cantidad:"));
                        String cantidad = linea.substring(linea.indexOf("Cantidad:") + 10, linea.indexOf(" -"));
                        Modelo datos = new Modelo(nombreMarca, denominacion, tipoVehiculo, Integer.valueOf(cantidad));
                if (denominacionModelo != null && denominacionModelo.equalsIgnoreCase(datos.getDenominacion())
                        && datos.getCantidad() > 0) {
                    stock = datos.getCantidad();
                    existencia = true;
                    System.out.println("Del modelo " + denominacionModelo + " hay en existencia " + datos.getCantidad() + " unidades.");
                    break;
                } else if (denominacionModelo != null && denominacionModelo.equalsIgnoreCase(datos.getDenominacion())
                        && datos.getCantidad() == 0) {
                    existencia = true;
                    System.out.println("Del modelo " + denominacionModelo + " hay en existencia " + datos.getCantidad() + " unidades.");
                }
                linea = leer.readLine();
            }
            if (existencia == false) {
                System.out.println("El modelo no se encuentra en la lista!");
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
            throw new AccesoDatosEx("Error al buscar en el archivo modelos!" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new AccesoDatosEx("Error al buscar en el archivo modelos!" + ex.getMessage());
        }
        return stock;
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
        }
    }
}
