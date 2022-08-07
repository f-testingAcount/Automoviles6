package com.user;

import com.user.datos.AccesoDatosImpl;
import com.user.datos.IAccesoDatos;
import com.user.domain.*;
import com.user.exceptions.AccesoDatosEx;
import com.user.negocios.*;
import static com.user.negocios.IAccionesComerciales.*;

        
        
import java.util.*;

public class Ejecutable {

    public static void main(String[] args) throws AccesoDatosEx {
        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        Marca marca = new Marca();
        Modelo modelo = new Modelo();
        CaracteristicasTec caracteristica = new CaracteristicasTec();
        Distribuidor distribuidor = new Distribuidor();
        Agencia agencia = new Agencia();
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Recepcionista recepcionista = new Recepcionista();
        Mantenimiento mantenimiento = new Mantenimiento();
        Mecanico mecanico = new Mecanico();
        Taller taller = new Taller();
        
        IAccesoDatos datos = new AccesoDatosImpl();

        IAccionesComerciales accion = new AccionesComercialesImpl();

        int opcion = -1;

        do {
            opcion = 0;
            System.out.println("""
                               \nIngrese una opcion:
                               1 - Iniciar archivos (Marcas, Modelos, Caracteristicas Tecnicas,
                                                     Distribuidores, Agencias,
                                                     Gerentes, Vendedores,
                                                     Recepcionistas,
                                                     Operario de mantenimiento,
                                                     Mecanico, Taller)
                               2 - Agregar datos a uno de los archivos (Marcas,
                                                                        Modelos,
                                                                        Caracteristicas Tecnicas,
                                                                        Distribuidores, 
                                                                        Agencias,
                                                                        Gerentes,
                                                                        Vendedores,
                                                                        Recepcionistas,
                                                                        Operarios de mantenimiento,
                                                                        Mecanicos,
                                                                        Taller)
                               3 - Vender Vehiculo
                               4 - Ingresar al service de garantia
                               5 - Servicio mecanico externo
                               6 - Listar archivos (seleccione cual)
                               7 - Buscar (Marca, modelo, Caracteristica tecnica, 
                                           distribuidor, Agencia, Gerente, vendedor, 
                                           recepcionista, operario de mantenimiento,
                                           mecanico, taller)
                               8 - Borrar Archivo
                               9 - Test Control stock
                              10 - Test Buscar indice
                              11 - Test Buscar desde metodo en clase
                              12 - Test Enviar pedido / Recibir unidades
                              13 - Contratar o despedir empleado
                               0 - Salir
                               """);

        opcion = input.nextInt();

            switch (opcion) { //Iniciar archivos (Marcas, Modelos, Caracteristicas Tecnicas, Distribuidores, Agencias).
                case 1 ->
                    accion.iniciarArchivo();
                case 2 -> { //Agregar Marca, Modelo, Caracteristica tecnica, distribuidor, agencia, gerente, vendedor, recepcionista, mantenimiento, mecanicos.
                    opcion = 0;
                    System.out.println("""                                        
                                        Ingrese el nombre del archivo: 
                                        1 - Marcas.txt
                                        2 - Modelos.txt
                                        3 - Caracteristicas Tecnicas.txt
                                        4 - Distribuidores.txt
                                        5 - Agencias.txt
                                        6 - Gerentes.txt
                                        7 - Vendedores.txt
                                        8 - Recepcionistas.txt
                                        9 - Mantenimiento.txt
                                       10 - Mecanicos.txt
                                       11 - Taller.txt
                                        """);
                    opcion = input.nextInt();
                    switch (opcion) {
                        case 1 -> { //Agregar marca
                            String nombreArchivo = "Marcas.txt";
                            System.out.println("Ingrese el nombre de la marca: ");
                            var nombre = inputString.nextLine();
                            marca.setNombre(nombre);
                            System.out.println("Ingrese el origen de la marca: ");
                            var origen = inputString.nextLine();
                            marca.setOrigen(origen);
                            System.out.println("Ingrese el logo de la marca: ");
                            var logo = inputString.nextLine();
                            marca.setLogo(logo);
                            accion.agregar(nombreArchivo, marca);
                        }
                        case 2 -> { //Agregar modelo
                            String nombreArchivo = "Modelos.txt";
                            System.out.println("Ingrese la marca: ");
                            var nombreMarca = inputString.nextLine();
                            modelo.setNombreMarca(nombreMarca);
                            System.out.println("Ingrese la denominacion del modelo: ");
                            var denominacion = inputString.nextLine();
                            modelo.setDenominacion(denominacion);
                            System.out.println("Ingrese el tipo de vehiculo (auto, camioneta, moto, camion): ");
                            var tipoVehiculo = inputString.nextLine();
                            modelo.setTipoVehiculo(tipoVehiculo);
                            System.out.println("Ingrese la cantidad de unidades: ");
                            var cantidad = input.nextInt();
                            modelo.setCantidad(cantidad);
                            accion.agregar(nombreArchivo, modelo);
                        }
                        case 3 -> { //Agregar caracteristicas tecnicas
                            String nombreArchivo = "Caracteristicas Tecnicas.txt";
                            System.out.println("Ingrese la denominacion del modelo: ");
                            var modeloDenominacion = inputString.nextLine();
                            caracteristica.setModeloDenominacion(modeloDenominacion);
                            System.out.println("Ingrese el tipo de motor (Nafta, gasoil): ");
                            var tipoMotor = inputString.nextLine();
                            caracteristica.setTipoMotor(tipoMotor);
                            System.out.println("Ingrese la cantidad de cilindros: ");
                            var cilindros = inputString.nextLine();
                            caracteristica.setCilindros(cilindros);
                            System.out.println("Ingrese la cilindrada: ");
                            var cilindrada = input.nextInt();
                            caracteristica.setCilindrada(cilindrada);
                            System.out.println("Ingrese la potencia del motor en HP: ");
                            var HP = input.nextInt();
                            caracteristica.setHP(HP);
                            System.out.println("Ingrese las caracteristicas de la caja (Manual o automatica y la cantidad de velocidades): ");
                            var caja = inputString.nextLine();
                            caracteristica.setCaja(caja);
                            System.out.println("Ingrese el nivel de equipamiento (base o full): ");
                            var equipamiento = inputString.nextLine();
                            caracteristica.setEquipamiento(equipamiento);
                            System.out.println("Ingrese el tipo de carroceria (auto, camioneta, SUV, cantidad de puertas, camion, moto)");
                            var carroceria = inputString.nextLine();
                            caracteristica.setCarroceria(carroceria);
                            System.out.println("Ingrese el id del vehiculo: ");
                            var id = inputString.nextLine();
                            caracteristica.setId(id);
                            accion.agregar(nombreArchivo, caracteristica);
                        }
                        case 4 -> { //Agregar distribuidor
                            String nombreArchivo = "Distribuidores.txt";
                            System.out.println("Ingrese el nombre del distribuidor: ");
                            var nombreDistribuidor = inputString.nextLine();
                            distribuidor.setNombreDistribuidor(nombreDistribuidor);
                            System.out.println("Ingrese el pais donde se localiza la sede: ");
                            var pais = inputString.nextLine();
                            distribuidor.setPais(pais);
                            System.out.println("Ingrse la marca distribuida: ");
                            var marcaDistribuida = inputString.nextLine();
                            distribuidor.setMarcaDistribuida(marcaDistribuida);
                            accion.agregar(nombreArchivo, distribuidor);
                        }
                        case 5 -> { //Agregar agencia
                            String nombreArchivo = "Agencias.txt";
                            System.out.println("Ingrese el nombre de la agencia: ");
                            var nombreAgencia = inputString.nextLine();
                            agencia.setNombreAgencia(nombreAgencia);
                            System.out.println("Ingrese la ciudad donde se ubica la agencia: ");
                            var ciudad = inputString.nextLine();
                            agencia.setCiudad(ciudad);
                            System.out.println("Ingrese el nombre de la marca que comercializa la agencia: ");
                            var marcaComercializada = inputString.nextLine();
                            agencia.setMarcaComercializada(marcaComercializada);
                            accion.agregar(nombreArchivo, agencia);
                        }
                        case 6 -> { //Agregar gerente
                            String nombreArchivo = "Gerentes.txt";
                            System.out.println("Ingrese el nombre del gerente: ");
                            var nombre = inputString.nextLine();
                            gerente.setNombre(nombre);
                            System.out.println("Ingrese el apellido del gerente: ");
                            var apellido = inputString.nextLine();
                            gerente.setApellido(apellido);
                            System.out.println("Ingrese el DNI del gerente: ");
                            var dni = input.nextInt();
                            gerente.setDni(dni);
                            System.out.println("Ingrese la edad del gerente: ");
                            var edad = input.nextInt();
                            gerente.setEdad(edad);
                            System.out.println("Ingrese el area de desempeño: ");
                            var area = inputString.nextLine();
                            gerente.setArea(area);
                            System.out.println("Ingrese los estudios acreditados: ");
                            var estudios = inputString.nextLine();
                            gerente.setEstudios(estudios);
                            accion.agregar(nombreArchivo, gerente);
                        }
                        case 7 -> { //Agregar vendedor
                            String nombreArchivo = "Vendedores.txt";
                            System.out.println("Ingrese el nombre del vendedor: ");
                            var nombre = inputString.nextLine();
                            vendedor.setNombre(nombre);
                            System.out.println("Ingrese el apellido del vendedor: ");
                            var apellido = inputString.nextLine();
                            vendedor.setApellido(apellido);
                            System.out.println("Ingrese el DNI del vendedor: ");
                            var dni = input.nextInt();
                            vendedor.setDni(dni);
                            System.out.println("Ingrese la edad del vendedor: ");
                            var edad = input.nextInt();
                            vendedor.setEdad(edad);
                            System.out.println("Ingrese el area donde se desempeña el vendedor: ");
                            var area = inputString.nextLine();
                            vendedor.setArea(area);
                            System.out.println("Ingrese la formacion acreditada del vendedor: ");
                            var formacion = inputString.nextLine();
                            vendedor.setFormacion(formacion);
                            accion.agregar(nombreArchivo, vendedor);
                        }
                        case 8 -> { //Agregar recepcionista
                            String nombreArchivo = "Recepcionistas.txt";
                            System.out.println("Ingrese el nombre de la recepcionista: ");
                            var nombre = inputString.nextLine();
                            recepcionista.setNombre(nombre);
                            System.out.println("Ingrese el apellido de la recepcionista: ");
                            var apellido = inputString.nextLine();
                            recepcionista.setApellido(apellido);
                            System.out.println("Ingrese el DNI de la recepcionista: ");
                            var dni = input.nextInt();
                            recepcionista.setDni(dni);
                            System.out.println("Ingrese la edad de la recepcionista: ");
                            var edad = input.nextInt();
                            recepcionista.setEdad(edad);
                            System.out.println("Ingrese la formacion de la recepcionista: ");
                            var formacion = inputString.nextLine();
                            recepcionista.setFormacion(formacion);
                            accion.agregar(nombreArchivo, recepcionista);
                        }
                        case 9 -> { //Agregar operario mantenimiento
                            String nombreArchivo = "Mantenimiento.txt";
                            System.out.println("Ingrese el nombre del operario: ");
                            var nombre = inputString.nextLine();
                            mantenimiento.setNombre(nombre);
                            System.out.println("Ingrese el apellido del operario: ");
                            var apellido = inputString.nextLine();
                            mantenimiento.setApellido(apellido);
                            System.out.println("Ingrese el DNI del operario: ");
                            var dni = input.nextInt();
                            mantenimiento.setDni(dni);
                            System.out.println("Ingrese la edad del operario: ");
                            var edad = input.nextInt();
                            mantenimiento.setEdad(edad);
                            System.out.println("Ingrese el area de desempeño del operario: ");
                            var area = inputString.nextLine();
                            mantenimiento.setArea(area);
                            System.out.println("Ingrese la formacion del operario: ");
                            var formacion = inputString.nextLine();
                            mantenimiento.setFormacion(formacion);
                            accion.agregar(nombreArchivo, mantenimiento);
                        }
                        case 10 -> { //Agregar mecanico
                            String nombreArchivo = "Mecanicos.txt";
                            System.out.println("Ingrese el nombre del mecanico: ");
                            var nombre = inputString.nextLine();
                            mecanico.setNombre(nombre);
                            System.out.println("Ingrese el apellido del mecanico: ");
                            var apellido = inputString.nextLine();
                            mecanico.setApellido(apellido);
                            System.out.println("Ingrese el DNI del mecanico: ");
                            var dni = input.nextInt();
                            mecanico.setDni(dni);
                            System.out.println("Ingrese la edad del mecanico: ");
                            var edad = input.nextInt();
                            mecanico.setEdad(edad);
                            System.out.println("Ingrese la especialidad del mecanico: ");
                            var especialidad = inputString.nextLine();
                            mecanico.setEspecialidad(especialidad);
                            System.out.println("Ingrese la formacion acreditada por el mecanico: ");
                            var formacion = inputString.nextLine();
                            mecanico.setFormacion(formacion);
                            accion.agregar(nombreArchivo, mecanico);
                        }
                        case 11 -> { //Agregar taller
                            String nombreArchivo = "Taller.txt";
                            System.out.println("Ingrese la especialidad del taller: ");
                            var especialidad = inputString.nextLine();
                            taller.setEspecialidad(especialidad);
                            System.out.println("Ingrese la ciudad donde se ubica el taller: ");
                            var ciudad = inputString.nextLine();
                            taller.setCiudad(ciudad);
                            accion.agregar(nombreArchivo, taller);
                        }
                        default -> {
                            System.out.println("La opcion ingresada no existe, ingrese una opcion valida!");
                        }
                    }
                }

                case 3 -> { //Vender Vehiculo
                    System.out.println("A continuacion se solicitan los datos que se le solicitan del vehiculo que desea adquirir: ");
                    System.out.println("Ingrese el tipo de vehiculo (auto, camioneta, moto, camion): ");
                    var tipoVehiculo = inputString.nextLine();
                    modelo.setTipoVehiculo(tipoVehiculo);
                    System.out.println("Ingrese la denominacion del modelo: ");
                    var denominacionModelo = inputString.nextLine();
                    modelo.setDenominacion(denominacionModelo);
                    accion.venderVehiculo(ARCHIVO_MODELOS, denominacionModelo);
                }

                case 4 -> { //Ingresar al service de garantia
                }

                case 5 -> { //Servicio mecanico externo
                }

                case 6 -> { //Listar
                    opcion = 0;
                    System.out.println("""
                                       Ingrese el archivo a listar:
                                       1 - Marcas.txt
                                       2 - Modelos.txt
                                       3 - Caracteristicas Tecnicas.txt
                                       4 - Distribuidores.txt
                                       5 - Agencias.txt
                                       6 - Gerentes.txt
                                       7 - Vendedor.txt
                                       8 - Recepcionistas.txt
                                       9 - Mantenimiento.txt
                                      10 - Mecanicos.txt
                                      11 - Taller.txt
                                       """);
                    opcion = input.nextInt();
                    switch(opcion){
                        case 1 -> accion.listarArchivo(ARCHIVO_MARCAS, marca);
                        case 2 -> accion.listarArchivo(ARCHIVO_MODELOS, modelo);
                        case 3 -> accion.listarArchivo(ARCHIVO_CARACTERISTICAS_TEC, caracteristica);
                        case 4 -> accion.listarArchivo(ARCHIVO_DISTRIBUIDORES, distribuidor);
                        case 5 -> accion.listarArchivo(ARCHIVO_AGENCIAS, agencia);
                        case 6 -> accion.listarArchivo(ARCHIVO_GERENTES, gerente);
                        case 7 -> accion.listarArchivo(ARCHIVO_VENDEDORES, vendedor);
                        case 8 -> accion.listarArchivo(ARCHIVO_RECEPCIONISTAS, recepcionista);
                        case 9 -> accion.listarArchivo(ARCHIVO_MANTENIMIENTO, mantenimiento);
                        case 10 -> accion.listarArchivo(ARCHIVO_MECANICOS, mecanico);
                        case 11 -> accion.listarArchivo(ARCHIVO_TALLER, taller);
                        default -> System.out.println("La opcion ingresada no existe!, ingrese una opcion valida");
                    }
                }

                case 7 -> { //Buscar archivo
                    opcion = 0;
                    System.out.println("""
                                       Seleccione lo que desea buscar: 
                                       1 - Buscar Marca
                                       2 - Buscar Modelo
                                       3 - Buscar Caracteristicas tecnicas de un modelo
                                       4 - Buscar Distribuidor
                                       5 - Buscar Agencia
                                       6 - Buscar Gerente
                                       7 - Buscar Vendedor
                                       8 - Buscar Recepcionista
                                       9 - Buscar Operario de mantenimiento
                                      10 - Buscar Mecanico
                                      11 - Buscar Taller 
                                       """);
                    opcion = input.nextInt();
                    
                    switch(opcion){
                        case 1 -> {
                            System.out.println("Ingrese el nombre de la marca a buscar:");
                            var nombre = inputString.nextLine();
                            marca.setNombre(nombre);                    
                            System.out.println(datos.buscar(ARCHIVO_MARCAS, marca));
                        }
                        case 2 -> {
                            System.out.println("Ingrese la deniminacion del modelo: ");
                            var denominacion = inputString.nextLine();
                            modelo.setDenominacion(denominacion);
                            System.out.println(datos.buscar(ARCHIVO_MODELOS, modelo));
                        }
                        case 3 -> {
                            System.out.println("Ingrese la deniminacion del modelo del cual desea saber las caracteristicas: ");
                            var modeloDenominacion = inputString.nextLine();
                            caracteristica.setModeloDenominacion(modeloDenominacion);
                            System.out.println(datos.buscar(ARCHIVO_CARACTERISTICAS_TEC, caracteristica));
                        }
                        case 4 -> {
                            System.out.println("Ingrese el nombre del distribuidor: ");
                            var nombreDistribuidor = inputString.nextLine();
                            distribuidor.setNombreDistribuidor(nombreDistribuidor);
                            System.out.println(datos.buscar(ARCHIVO_DISTRIBUIDORES, distribuidor));
                        }
                        case 5 -> {
                            System.out.println("Ingrese el nombre de la agencia: ");
                            var nombreAgencia = inputString.nextLine();
                            agencia.setNombreAgencia(nombreAgencia);
                            System.out.println(datos.buscar(ARCHIVO_AGENCIAS, agencia));
                        }
                        case 6 -> {
                            System.out.println("Ingrese el nombre del gerente: ");
                            var nombre = inputString.nextLine();
                            gerente.setNombre(nombre);
                            System.out.println("Ingrese el apellido del gerente: ");
                            var apellido = inputString.nextLine();
                            gerente.setApellido(apellido);
                            System.out.println(datos.buscar(ARCHIVO_GERENTES, gerente));
                        }
                        case 7 -> {
                            System.out.println("Ingrese el nombre del vendedor: ");
                            var nombre = inputString.nextLine();
                            vendedor.setNombre(nombre);
                            System.out.println("Ingrese el apellido del vendedor: ");
                            var apellido = inputString.nextLine();
                            vendedor.setApellido(apellido);
                            System.out.println(datos.buscar(ARCHIVO_VENDEDORES, vendedor));
                        }
                        case 8 -> {
                            System.out.println("Ingrese el nombre de la recepcionista: ");
                            var nombre = inputString.nextLine();
                            recepcionista.setNombre(nombre);
                            System.out.println("Ingrese el apellido de la recepcionista: ");
                            var apellido = inputString.nextLine();
                            recepcionista.setApellido(apellido);
                            System.out.println(datos.buscar(ARCHIVO_RECEPCIONISTAS, recepcionista));
                        }
                        case 9 -> {
                            System.out.println("Ingrese el nombre del operario de mantenimiento: ");
                            var nombre = inputString.nextLine();
                            mantenimiento.setNombre(nombre);
                            System.out.println("Ingrese el apellido del operario: ");
                            var apellido = inputString.nextLine();
                            mantenimiento.setApellido(apellido);
                            System.out.println(datos.buscar(ARCHIVO_MANTENIMIENTO, mantenimiento));
                        }
                        case 10 -> {
                            System.out.println("Ingrese el nombre del mecanico: ");
                            var nombre = inputString.nextLine();
                            mecanico.setNombre(nombre);
                            System.out.println("Ingrese el apellido del mecanico: ");
                            var apellido = inputString.nextLine();
                            mecanico.setApellido(apellido);
                            System.out.println(datos.buscar(ARCHIVO_MECANICOS, mecanico));
                        }
                        case 11 -> {
                            System.out.println("Ingrese la especialidad del taller: ");
                            var especialidad = inputString.nextLine();
                            taller.setEspecialidad(especialidad);
                            System.out.println(datos.buscar(ARCHIVO_TALLER, taller));
                        }
                        default -> System.out.println("La opcion ingresada no existe!, ingrese una opcion valida");
                    }
                }

                case 8 -> { //Borrar Archivo
                    opcion = 0;
                    System.out.println(""" 
                                        Ingrese el nombre del archivo: 
                                        1 - Marcas.txt
                                        2 - Modelos.txt
                                        3 - Caracteristicas Tecnicas.txt
                                        4 - Distribuidores.txt
                                        5 - Agencias.txt
                                        6 - Gerentes.txt
                                        7 - Vendedor.txt
                                        8 - Recepcionistas.txt
                                        9 - Mantenimiento.txt
                                       10 - Mecanicos.txt
                                       11 - Taller.txt
                                        """);
                    
                    opcion = input.nextInt();
                    
                    switch (opcion){
                        case 1 -> {
                            accion.borrarArchivo(ARCHIVO_MARCAS);
                            System.out.println("El archivo Marcas.txt ha sido borrado!");
                        }
                        case 2 -> {
                            accion.borrarArchivo(ARCHIVO_MODELOS);
                            System.out.println("El archivo Modelos.txt ha sido borrado!");
                        }
                        case 3 -> {
                            accion.borrarArchivo(ARCHIVO_CARACTERISTICAS_TEC);
                            System.out.println("El archivo Caracteristicas Tecnicas.txt ha sido borrado!");
                        }
                        case 4 -> {
                            accion.borrarArchivo(ARCHIVO_DISTRIBUIDORES);
                            System.out.println("El archivo Distribuidores.txt ha sido borrado!");
                        }
                        case 5 -> {accion.borrarArchivo(ARCHIVO_AGENCIAS); 
                        System.out.println("El archivo Agencias.txt ha sido borrado!");
                        }
                        case 6 -> {
                            accion.borrarArchivo(ARCHIVO_GERENTES);
                            System.out.println("El archivo Gerentes.txt ha sido borrado!");
                        }
                        case 7 -> {
                            accion.borrarArchivo(ARCHIVO_VENDEDORES);
                            System.out.println("El archivo Vendedores.txt ha sido borrado!");
                        }
                        case 8 -> {
                            accion.borrarArchivo(ARCHIVO_RECEPCIONISTAS);
                            System.out.println("El archivo Recepcionistas.txt ha sido borrado!");
                        }
                        case 9 -> {
                            accion.borrarArchivo(ARCHIVO_MANTENIMIENTO);
                            System.out.println("El archivo Mantenimiento.txt ha sido borrado!");
                        }
                        case 10 -> {
                            accion.borrarArchivo(ARCHIVO_MECANICOS);
                            System.out.println("El archivo Mecanicos.txt ha sido borrado!");
                        }
                        case 11 -> {
                            accion.borrarArchivo(ARCHIVO_TALLER);
                            System.out.println("El archivo taller.txt ha sido borrado!");
                        }
                        default -> System.out.println("La opcion ingresada no existe!, ingrese una opcion valida");
                    }
                }

                case 9 -> { //Test control stock
                    System.out.println("Control de stock");
                    System.out.println("Ingrese el modelo: ");
                    var denominacionModelo = inputString.nextLine();
                    modelo.setDenominacion(denominacionModelo);
                    datos.stockModelo(ARCHIVO_MODELOS, denominacionModelo);
                }
                
                case 10 -> { //Test Buscar por indice
                    System.out.println("Ingrese el nombre del modelo a indexar: ");
                    var modeloDenominacion = inputString.nextLine();
                    modelo.setDenominacion(modeloDenominacion);
                    System.out.println(datos.buscarIndice(ARCHIVO_MODELOS, modelo, modeloDenominacion));
                }
                
                case 11 -> { // Test buscar desde metodo en clase
//                    System.out.println("Ingrese el nombre de la agencia: ");
//                    var nombreAgencia = inputString.nextLine();
//                    System.out.println(distribuidor.buscarAgenciaPorNombre(nombreAgencia));
                }
                
                case 12 -> { // Test Solicitar / Recibir unidades
                    System.out.println("Ingrese el nombre del modelo del cual se necesita stock: ");
                    var denominacionModelo = inputString.nextLine();
                    System.out.println("Ingrese la cantidad de unidades solicitadas a incorporar en stock: ");
                    var unidadesRecibidas = input.nextInt();
                    accion.enviarRecibirPedidoDeFabricante(ARCHIVO_MODELOS, modelo, denominacionModelo, unidadesRecibidas);
                }
                
                case 13 -> { //Contratar o despedir empleado
                    opcion = 0;
                    System.out.println("""
                                        Ingrese el nombre del archivo donde desea agregar o despedir empleado:
                                        1 - Archivo Gerentes.txt
                                        2 - Archivo Vendedores.txt
                                        3 - Archivo Recepcionistas.txt
                                        4 - Archivo Mantenimiento.txt
                                        5 - Archivo Mecanicos.txt
                                        6 - Archivo Taller.txt
                                        """);
                    
                    opcion = input.nextInt();
                    
                    switch(opcion){
                        
                        case 1 -> {
                            
                        }
                        
                        case 2 -> {
                            
                        }
                        
                        case 3 -> {
                            
                        }
                        
                        case 4 -> {
                            
                        }
                        
                        case 5 -> {
                            
                        }
                        
                        case 6 -> {
                            
                        }
                        
                        default -> System.out.println("La opcion seleccionada no existe ingrese una opcion valida!");
                    }
                }
                
                case 0 -> { //Salir
                    System.out.println("Hasta pronto!");
                    System.exit(0);
                }
                                
                default -> { //Como evitar la excepcion si no ingreso un valor y solo ingreso enter?
                        System.out.println("La opcion ingresada no existe! , ingrese una opcion valida! ");
                }
            }
        } while (opcion != 0);
    }
}
