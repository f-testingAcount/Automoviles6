package com.user.negocios;

import com.user.domain.Vendedor;
import com.user.domain.Recepcionista;
import com.user.domain.Mecanico;
import com.user.domain.Mantenimiento;
import com.user.domain.Gerente;
import com.user.datos.*;
import com.user.domain.*;
import com.user.exceptions.AccesoDatosEx;
import com.user.negocios.*;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_AGENCIAS;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_CARACTERISTICAS_TEC;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_DISTRIBUIDORES;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_GERENTES;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_MANTENIMIENTO;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_MARCAS;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_MECANICOS;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_MODELOS;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_RECEPCIONISTAS;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_VENDEDORES;
import static com.user.negocios.IAccionesComerciales.ARCHIVO_TALLER;
import java.util.List;


public class AccionesComercialesImpl implements IAccionesComerciales {

    IAccesoDatos datos;

    public AccionesComercialesImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void iniciarArchivo() {
        try {
            if (this.datos.existe(ARCHIVO_MARCAS)) {
                System.out.println("El archivo Marcas ya existe!");
            } else {
                this.datos.crear(ARCHIVO_MARCAS);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar archivo Marcas!");
            ex.printStackTrace(System.out);
        }
        try {
            if (this.datos.existe(ARCHIVO_MODELOS)) {
                System.out.println("El archivo Modelos ya existe!");
            } else {
                this.datos.crear(ARCHIVO_MODELOS);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar archivo Modelos!");
            ex.printStackTrace(System.out);
        }
        try {
            if (this.datos.existe(ARCHIVO_CARACTERISTICAS_TEC)) {
                System.out.println("El archivo Caracteristicas Tecnicas ya existe!");

            } else {
                this.datos.crear(ARCHIVO_CARACTERISTICAS_TEC);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar archivo Caracteristicas Tecnicas!");
            ex.printStackTrace(System.out);
        }
        try {
            if (this.datos.existe(ARCHIVO_DISTRIBUIDORES)) {
                System.out.println("El archivo Distribuidores ya existe!");

            } else {
                this.datos.crear(ARCHIVO_DISTRIBUIDORES);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar archivo Distribuidores!");
            ex.printStackTrace(System.out);
        }
        try {
            if (this.datos.existe(ARCHIVO_AGENCIAS)) {
                System.out.println("El archivo Agencias ya existe!");
            } else {
                this.datos.crear(ARCHIVO_AGENCIAS);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar archivo Agencias!");
            ex.printStackTrace(System.out);
        }
        try {
            if (this.datos.existe(ARCHIVO_GERENTES)) {
                System.out.println("El archivo Gerentes ya existe!");
            } else {
                this.datos.crear(ARCHIVO_GERENTES);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar archivo Gerentes!");
            ex.printStackTrace(System.out);
        }
        try {
            if (this.datos.existe(ARCHIVO_VENDEDORES)) {
                System.out.println("El archivo Vendedores ya existe!");
            } else {
                this.datos.crear(ARCHIVO_VENDEDORES);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar archivo Vendedores!");
            ex.printStackTrace(System.out);
        }
        try {
            if (this.datos.existe(ARCHIVO_RECEPCIONISTAS)) {
                System.out.println("El archivo Recepcionistas ya existe!");
            } else {
                this.datos.crear(ARCHIVO_RECEPCIONISTAS);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar archivo Recepcionistas!");
            ex.printStackTrace(System.out);
        }
        try {
            if (this.datos.existe(ARCHIVO_MANTENIMIENTO)) {
                System.out.println("El archivo Mantenimiento ya existe!");
            } else {
                this.datos.crear(ARCHIVO_MANTENIMIENTO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar archivo Mantenimiento!");
            ex.printStackTrace(System.out);
        }
        try {
            if (this.datos.existe(ARCHIVO_MECANICOS)) {
                System.out.println("El archivo Mecanicos ya existe!");
            } else {
                this.datos.crear(ARCHIVO_MECANICOS);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar archivo Mecanicos!");
            ex.printStackTrace(System.out);
        }
        try {
            if (this.datos.existe(ARCHIVO_TALLER)) {
                System.out.println("El archivo Taller ya existe!");
            } else {
                this.datos.crear(ARCHIVO_TALLER);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar archivo taller!");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void agregar(String nombreArchivo, Object object) {
        if (nombreArchivo.equalsIgnoreCase("Marcas.txt")) {
            Marca marca = (Marca) object;
            marca = new Marca(marca.getNombre(), marca.getOrigen(), marca.getLogo());
            boolean anexar = false;
            try {
                if (anexar = datos.existe(ARCHIVO_MARCAS)) {
                    this.datos.escribir(marca, ARCHIVO_MARCAS);
                    System.out.println("Se agrego una marca al archivo marcas!");
                } else {
                    System.out.println("El archivo Marcas no existe!");
                }
            } catch (AccesoDatosEx ex) {
                System.out.println("Error al agregar marca!");
                ex.printStackTrace(System.out);
            }
        } else if (nombreArchivo.equalsIgnoreCase("Modelos.txt")) {
            Modelo modelo = (Modelo) object;
            modelo = new Modelo(modelo.getNombreMarca(), modelo.getTipoVehiculo(),
                    modelo.getDenominacion(),
                    modelo.getCantidad());
            boolean anexar = false;
            try {
                if (anexar = datos.existe(ARCHIVO_MODELOS)) {
                    this.datos.escribir(modelo, ARCHIVO_MODELOS);
                    System.out.println("Se agrego un modelo al archivo modelos!");
                } else {
                    System.out.println("El archivo modelos no existe!");
                }
            } catch (AccesoDatosEx ex) {
                System.out.println("Error al agregar modelo!");
                ex.printStackTrace(System.out);
            }
        } else if (nombreArchivo.equalsIgnoreCase("Caracteristicas Tecnicas.txt")) {
            CaracteristicasTec caracteristica = (CaracteristicasTec) object;
            caracteristica = new CaracteristicasTec(caracteristica.getModeloDenominacion(),
                    caracteristica.getTipoMotor(),
                    caracteristica.getCilindros(),
                    caracteristica.getCilindrada(),
                    caracteristica.getHP(),
                    caracteristica.getCaja(),
                    caracteristica.getEquipamiento(),
                    caracteristica.getCarroceria(),
                    caracteristica.getId());

            boolean anexar = false;
            try {
                if (anexar = datos.existe(ARCHIVO_CARACTERISTICAS_TEC)) {
                    this.datos.escribir(caracteristica, ARCHIVO_CARACTERISTICAS_TEC);
                    System.out.println("Se agrego una caracteristica al archivo caracteristicas tecnicas!");
                } else {
                    System.out.println("El archivo caracteristicas tecnicas no existe!");
                }
            } catch (AccesoDatosEx ex) {
                System.out.println("Error al agregar caracteristica tecnica!");
                ex.printStackTrace(System.out);
            }
        } else if (nombreArchivo.equalsIgnoreCase("Distribuidores.txt")) {
            Distribuidor distribuidor = (Distribuidor) object;
            distribuidor = new Distribuidor(distribuidor.getNombreDistribuidor(),
                                            distribuidor.getPais(),
                                            distribuidor.getMarcaDistribuida());
            boolean anexar = false;
            try {
                if (anexar = datos.existe(ARCHIVO_DISTRIBUIDORES)) {
                    this.datos.escribir(distribuidor, ARCHIVO_DISTRIBUIDORES);
                    System.out.println("Se agrego un distribuidor al archivo distribuidores!");
                } else {
                    System.out.println("El archivo distribuidores no existe!");
                }
            } catch (AccesoDatosEx ex) {
                System.out.println("Error al agregar distribuidor!");
                ex.printStackTrace(System.out);
            }
        } else if (nombreArchivo.equalsIgnoreCase("Agencias.txt")) {
            Agencia agencia = (Agencia) object;
            agencia = new Agencia(agencia.getNombreAgencia(),
                    agencia.getCiudad(),
                    agencia.getMarcaComercializada());
            boolean anexar = false;
            try {
                if (anexar = datos.existe(ARCHIVO_AGENCIAS)) {
                    this.datos.escribir(agencia, ARCHIVO_AGENCIAS);
                    System.out.println("Se agrego una agencia al archivo agencias!");
                } else {
                    System.out.println("El archivo agencias no existe!");
                }
            } catch (AccesoDatosEx ex) {
                System.out.println("Error al agregar agencia!");
                ex.printStackTrace(System.out);
            }
        } else if (nombreArchivo.equalsIgnoreCase("Gerentes.txt")) {
            Gerente gerente = (Gerente) object;
            gerente = new Gerente(gerente.getArea(),
                                  gerente.getEstudios(),
                                  gerente.getNombre(),
                                  gerente.getApellido(),
                                  gerente.getDni(),
                                  gerente.getEdad());
            boolean anexar = false;
            try {
                if (anexar = datos.existe(ARCHIVO_GERENTES)) {
                    this.datos.escribir(gerente, ARCHIVO_GERENTES);
                    System.out.println("Se agrego un gerente al archivo gerentes!");
                } else {
                    System.out.println("El archivo gerentes no existe!");
                }
            } catch (AccesoDatosEx ex) {
                System.out.println("Error al agregar gerente!");
                ex.printStackTrace(System.out);
            }
        } else if (nombreArchivo.equalsIgnoreCase("Vendedores.txt")) {
            Vendedor vendedor = (Vendedor) object;
            vendedor = new Vendedor(vendedor.getArea(),
                                    vendedor.getFormacion(),
                                    vendedor.getNombre(),
                                    vendedor.getApellido(),
                                    vendedor.getDni(),
                                    vendedor.getEdad());
            boolean anexar = false;
            try {
                if (anexar = datos.existe(ARCHIVO_VENDEDORES)) {
                    this.datos.escribir(vendedor, ARCHIVO_VENDEDORES);
                    System.out.println("Se agrego un vendedor al archivo vendedores!");
                } else {
                    System.out.println("El archivo vendedores no existe!");
                }
            } catch (AccesoDatosEx ex) {
                System.out.println("Error al agregar vendedor!");
                ex.printStackTrace(System.out);
            }
        } else if (nombreArchivo.equalsIgnoreCase("Recepcionistas.txt")) {
            Recepcionista recepcionista = (Recepcionista) object;
            recepcionista = new Recepcionista(recepcionista.getFormacion(),
                                              recepcionista.getNombre(),
                                              recepcionista.getApellido(),
                                              recepcionista.getDni(),
                                              recepcionista.getEdad());
            boolean anexar = false;
            try {
                if (anexar = datos.existe(ARCHIVO_RECEPCIONISTAS)) {
                    this.datos.escribir(recepcionista, ARCHIVO_RECEPCIONISTAS);
                    System.out.println("Se agrego una recepcionista al archivo recepcionistas!");
                } else {
                    System.out.println("El archivo recepcionistas no existe!");
                }
            } catch (AccesoDatosEx ex) {
                System.out.println("Error al agregar recepcionista!");
                ex.printStackTrace(System.out);
            }
        } else if (nombreArchivo.equalsIgnoreCase("Mantenimiento.txt")) {
            Mantenimiento mantenimiento = (Mantenimiento) object;
            mantenimiento = new Mantenimiento(mantenimiento.getArea(),
                                              mantenimiento.getFormacion(),
                                              mantenimiento.getNombre(),
                                              mantenimiento.getApellido(),
                                              mantenimiento.getDni(),
                                              mantenimiento.getEdad());
            boolean anexar = false;
            try {
                if (anexar = datos.existe(ARCHIVO_MANTENIMIENTO)) {
                    this.datos.escribir(mantenimiento, ARCHIVO_MANTENIMIENTO);
                    System.out.println("Se agrego un operario al archivo mantenimiento!");
                } else {
                    System.out.println("El archivo mantenimiento no existe!");
                }
            } catch (AccesoDatosEx ex) {
                System.out.println("Error al agregar operario!");
                ex.printStackTrace(System.out);
            }
        } else if (nombreArchivo.equalsIgnoreCase("Mecanicos.txt")) {
            Mecanico mecanico = (Mecanico) object;
            mecanico = new Mecanico(mecanico.getEspecialidad(),
                                    mecanico.getFormacion(),
                                    mecanico.getNombre(),
                                    mecanico.getApellido(),
                                    mecanico.getDni(),
                                    mecanico.getEdad());
            boolean anexar = false;
            try {
                if (anexar = datos.existe(ARCHIVO_MECANICOS)) {
                    this.datos.escribir(mecanico, ARCHIVO_MECANICOS);
                    System.out.println("Se agrego una mecanico al archivo mecanicos!");
                } else {
                    System.out.println("El archivo mecanicos no existe!");
                }
            } catch (AccesoDatosEx ex) {
                System.out.println("Error al agregar mecanico!");
                ex.printStackTrace(System.out);
            }
        } else if (nombreArchivo.equalsIgnoreCase("Taller.txt")) {
            Taller taller = (Taller) object;
            taller = new Taller(taller.getEspecialidad(),
                                taller.getCiudad());
            boolean anexar = false;
            try {
                if (anexar = datos.existe(ARCHIVO_TALLER)) {
                    this.datos.escribir(taller, ARCHIVO_TALLER);
                    System.out.println("Se agrego un taller al archivo taller!");
                } else {
                    System.out.println("El archivo taller no existe!");
                }
            } catch (AccesoDatosEx ex) {
                System.out.println("Error al agregar taller!");
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public void listarArchivo(String nombreArchivo, Object object) {
        switch (nombreArchivo) {
            case ARCHIVO_MARCAS -> {
                Marca marca = (Marca) object;
                try {
                    List<Marca> marcas = this.datos.listar(marca, ARCHIVO_MARCAS);
                    for (Marca detalle : marcas) {
                        System.out.println(detalle);
                    }
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error al listar marcas!");
                    ex.printStackTrace(System.out);
                }
            }
            case ARCHIVO_MODELOS -> {
                Modelo modelo = (Modelo) object;
                try {
                    List<Modelo> modelos = this.datos.listar(modelo, ARCHIVO_MODELOS);
                    for (Modelo detalle : modelos) {
                        System.out.println(detalle);
                    }
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error al listar modelos!");
                    ex.printStackTrace(System.out);
                }
            }
            case ARCHIVO_CARACTERISTICAS_TEC -> {
                CaracteristicasTec caracteristica = (CaracteristicasTec) object;
                try {
                    List<CaracteristicasTec> caracteristicas = this.datos.listar(caracteristica, ARCHIVO_CARACTERISTICAS_TEC);
                    for (CaracteristicasTec detalle : caracteristicas) {
                        System.out.println(detalle);
                    }
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error al listar caracteristicas tecnicas!");
                    ex.printStackTrace(System.out);
                }
            }
            case ARCHIVO_DISTRIBUIDORES -> {
                Distribuidor distribuidor = (Distribuidor) object;
                try {
                    List<Distribuidor> distribuidores = this.datos.listar(distribuidor, ARCHIVO_DISTRIBUIDORES);
                    for (Distribuidor detalle : distribuidores) {
                        System.out.println(detalle);
                    }
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error al listar distribuidores!");
                    ex.printStackTrace(System.out);
                }
            }
            case ARCHIVO_AGENCIAS -> {
                Agencia agencia = (Agencia) object;
                try {
                    List<Agencia> agencias = this.datos.listar(agencia, ARCHIVO_AGENCIAS);
                    for (Agencia detalle : agencias) {
                        System.out.println(detalle);
                    }
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error al listar agencias!");
                    ex.printStackTrace(System.out);
                }
            }
            case ARCHIVO_GERENTES -> {
                Gerente gerente = (Gerente) object;
                try {
                    List<Gerente> gerentes = this.datos.listar(gerente, ARCHIVO_GERENTES);
                    for (Gerente detalle : gerentes) {
                        System.out.println(detalle);
                    }
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error al listar gerentes!");
                    ex.printStackTrace(System.out);
                }
            }
            case ARCHIVO_VENDEDORES -> {
                Vendedor vendedor = (Vendedor) object;
                try {
                    List<Vendedor> vendedores = this.datos.listar(vendedor, ARCHIVO_VENDEDORES);
                    for (Vendedor detalle : vendedores) {
                        System.out.println(detalle);
                    }
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error al listar vendedores!");
                    ex.printStackTrace(System.out);
                }
            }
            case ARCHIVO_RECEPCIONISTAS -> {
                Recepcionista recepcionista = (Recepcionista) object;
                try {
                    List<Recepcionista> recepcionistas = this.datos.listar(recepcionista, ARCHIVO_RECEPCIONISTAS);
                    for (Recepcionista detalle : recepcionistas) {
                        System.out.println(detalle);
                    }
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error al listar recepcionistas!");
                    ex.printStackTrace(System.out);
                }
            }
            case ARCHIVO_MECANICOS -> {
                Mecanico mecanico = (Mecanico) object;
                try {
                    List<Mecanico> mecanicos = this.datos.listar(mecanico, ARCHIVO_MECANICOS);
                    for (Mecanico detalle : mecanicos) {
                        System.out.println(detalle);
                    }
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error al listar mecanicos!");
                    ex.printStackTrace(System.out);
                }
            }
            case ARCHIVO_MANTENIMIENTO -> {
                Mantenimiento operario = (Mantenimiento) object;
                try {
                    List<Mantenimiento> operarios = this.datos.listar(operario, ARCHIVO_MANTENIMIENTO);
                    for (Mantenimiento detalle : operarios) {
                        System.out.println(detalle);
                    }
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error al listar operarios!");
                    ex.printStackTrace(System.out);
                }
            }
            case ARCHIVO_TALLER -> {
                Taller taller = (Taller) object;
                try {
                    List<Taller> talleres = this.datos.listar(taller, ARCHIVO_TALLER);
                    for (Taller detalle : talleres) {
                        System.out.println(detalle);
                    }
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error al listar talleres!");
                    ex.printStackTrace(System.out);
                }
            }
            default -> {
                System.out.println("El archivo no pertenece a esta lista!");
            }
        }
    }

    @Override
    public void venderVehiculo(String nombreArchivo, String denominacionModelo) {
        nombreArchivo = ARCHIVO_MODELOS;
        Modelo modelo = new Modelo();
        try {
            int existencia = datos.stockModelo(nombreArchivo, denominacionModelo);
            if (existencia >= 1) {
                int stock = existencia - 1;
                List<Modelo> modelos = datos.listar(modelo, ARCHIVO_MODELOS);
                for (int i = 0; i < modelos.size(); i++) {
                    if (modelos.get(i).getDenominacion().equalsIgnoreCase(denominacionModelo)) {
                        modelos.get(i).setCantidad(stock);
                        break;
                    }
                }
                datos.modificarDatoEnArchivo(ARCHIVO_MODELOS, modelos);
                System.out.println("Se ha venido un vehiculo " + denominacionModelo + " Quedan en stock " + stock + " unidades.");
            } else if(existencia == 1) {
                System.out.println("Se ha enviado pedido de reposicion de unidades a fabricante.");
            } else if (existencia == 0) {
                System.out.println("Momentaneamente no hay disponibilidad de este modelo.");
                System.out.println("Se le informara cuando haya unidades disponibles en stock.");
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al procesar venta!");
            ex.printStackTrace(System.out);
        }
    }
    
    @Override
    public void enviarRecibirPedidoDeFabricante(String nombreArchivo, Modelo modelo, String denominacionModelo, int unidadesRecibidas) {
        nombreArchivo = ARCHIVO_MODELOS;
        try {
            List<Modelo> modelos = datos.listar(modelo, ARCHIVO_MODELOS);
            var nuevoStock = unidadesRecibidas;
            for (int i = 0; i < modelos.size(); i++) {
                if (modelos.get(i).getDenominacion().equalsIgnoreCase(denominacionModelo)) {
                    if (modelos.get(i).getCantidad() > 0) {
                        modelos.get(i).setCantidad(modelos.get(i).getCantidad() + nuevoStock);
                        System.out.println("Se incorporaron al stock existente " + nuevoStock + " unidades del modelo " + modelos.get(i).getDenominacion());
                        break;
                    } else {
                        modelos.get(i).setCantidad(nuevoStock);
                        System.out.println("Se incorporaron " + nuevoStock + " unidades del modelo " + modelos.get(i).getDenominacion());
                        break;
                    }
                }
            }
            datos.modificarDatoEnArchivo(ARCHIVO_MODELOS, modelos);
            datos.stockModelo(ARCHIVO_MODELOS, denominacionModelo);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al solicitar reposicion!");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void ingresarAlService(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void enviarUnidadesAAgencia(Marca marca, Modelo modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarArchivo(String nombreArchivo) {
        try {
            if (this.datos.existe(nombreArchivo)) {
                this.datos.borrar(nombreArchivo);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al borrar el archivo");
            ex.printStackTrace(System.out);
        }
    }
}
