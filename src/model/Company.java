package model;

public class Company {
	//Goez se la come
	//Goez se la come x2
	//Goez se la come x3
	
	private Departament departament;
	
	
	public Company( ) {
		super();
		this.departament = null;
		
	}
	
	
	
	
	
	public void calcularCostos(double inventarioInicialUnidades, double mDinvenrarioInicial, double mODinventarioInicial,
			double cIFinventarioInicial, double cCinventarioIncial, double porcentajeMDinventarioInicial,
			double porcentajeMODinventarioInicial, double porcentajeCIFinventarioInicial,
			double porcentajeCCinventarioIncial, double productoEnProceso, double mD, double mOD, double cIF, double cC,
			double inventarioFinal, double porcentajeMDinventarioFinal, double porcentajeMODinventarioFinal,
			double porcentajeCIFinventarioFinal, double porcentajeCCinventarioFinal, double unidadesTerminadas,
			double costoTransferidoPorUnidad, boolean porCC) {
		
			departament = new Departament(inventarioInicialUnidades, mDinvenrarioInicial, mODinventarioInicial, cIFinventarioInicial, cCinventarioIncial, porcentajeMDinventarioInicial, porcentajeMODinventarioInicial, porcentajeCIFinventarioInicial, porcentajeCCinventarioIncial, productoEnProceso, mD, mOD, cIF, cC, inventarioFinal, porcentajeMDinventarioFinal, porcentajeMODinventarioFinal, porcentajeCIFinventarioFinal, porcentajeCCinventarioFinal, unidadesTerminadas, costoTransferidoPorUnidad, porCC);
			departament.calcularCostos();
	}
	
	
	
	public static void main(String[] args) {
<<<<<<< HEAD
		Company company = new Company();
=======
		@SuppressWarnings("unused")
		Company company = new Company("company sa", 1);
>>>>>>> a9a07ed5f7b3ca4ecb6d2ae622afd3878c712299
		Departament dp = new Departament(15500, 1020000, 820000, 800000, 0, 100, 0, 0, 65, 36000, 2029200.50 , 2726625, 2627750.75, 0, 3500, 100, 0, 0, 45, 48000, 0, true);
		
		dp.calcularCostos();
		
		
		System.out.println("---FLUJO FISICO---");
		System.out.println("Inventario inicial pp " + dp.getInventarioInicialUnidades());
		System.out.println("U. comenzadas         " + dp.getProductoEnProceso());
		System.out.println("Unidades en proceso   " + dp.getFlujoFisico().getUnidadesAcostear());
		
		System.out.println("\n---PRODUCCION EQUIVALENTE---");
		System.out.println("Inventario Incial pp     " + dp.getInventarioInicialUnidades());
		System.out.println("Comenzadas y terminadas  "+dp.getFlujoFisico().getUnidadesComenzadasYterminadas());
		System.out.println("Inventario Final pp      "+dp.getInventarioFinal());
		System.out.println("Total unidades a costear "+dp.getFlujoFisico().getUnidadesAcostear());
		
		System.out.println("\nProduccion equivalente md");
		System.out.println("Inventario Incial pp     "+dp.getFlujoFisico().getMDequivalenteInventarioInicial());
		System.out.println("Comenzadas y terminadas  "+dp.getFlujoFisico().getUnidadesComenzadasYterminadas());
		System.out.println("Inventario Final pp      "+dp.getFlujoFisico().getMDequivalenteInventarioFinal());
		System.out.println("Total unidades a costear "+dp.getFlujoFisico().getUnidadesAcostearMD());
		
		System.out.println("\nProduccion equivalente mod");
		System.out.println("Inventario Incial pp     "+dp.getFlujoFisico().getMODequivalenteInventarioInicial());
		System.out.println("Comenzadas y terminadas  "+dp.getFlujoFisico().getUnidadesComenzadasYterminadas()); 
		System.out.println("Inventario Final pp      "+dp.getFlujoFisico().getMODequivalenteInventarioFinal());
		System.out.println("Total unidades a costear "+dp.getFlujoFisico().getUnidadesAcostearMOD());
		
		System.out.println("\nProduccion equivalente cif");
		System.out.println("Inventario Incial pp     "+dp.getFlujoFisico().getCIFequivalenteInventarioInicial());
		System.out.println("Comenzadas y terminadas  "+dp.getFlujoFisico().getUnidadesComenzadasYterminadas());
		System.out.println("Inventario Final pp      "+dp.getFlujoFisico().getCIFequivalenteInventarioFinal());
		System.out.println("Total unidades a costear "+dp.getFlujoFisico().getUnidadesAcostearCIF());
		
		System.out.println("\nProduccion equivalente cc");
		System.out.println("Inventario Incial pp     "+dp.getFlujoFisico().getCCequivalenteInventarioInicial());
		System.out.println("Comenzadas y terminadas  "+dp.getFlujoFisico().getUnidadesComenzadasYterminadas());
		System.out.println("Inventario Final pp      "+dp.getFlujoFisico().getCCequivalenteInventarioFinal());
		System.out.println("Total unidades a costear "+dp.getFlujoFisico().getUnidadesAcostearCC());
		
		
		System.out.println("\n---COSTO POR UNIDAD---");
		System.out.println("MD                     "+ dp.getCostoPorUnidad().getCostoMDporUnidad());
		System.out.println("MOD                    "+dp.getCostoPorUnidad().getCostoMODporUnidad());
		System.out.println("CIF                    "+dp.getCostoPorUnidad().getCostoCIFporUnidad());
		System.out.println("Total Costo por unidad "+dp.getCostoPorUnidad().getTotalCostoPorUnidad());
		
		System.out.println("\n---ASIGNACION DE COSTOS---");
		System.out.println("Producto terminado :");
		System.out.println("\tInventario inicial     "+dp.getAsignacionDeCostos().getPrecioInventarioInicial());
		System.out.println("\tMD                     "+dp.getAsignacionDeCostos().getPrecioInventarioInicialMD());
		System.out.println("\tMOD                    "+dp.getAsignacionDeCostos().getPrecioInventarioInicialMOD());
		System.out.println("\tCIF                    "+dp.getAsignacionDeCostos().getPrecioInvetnarioIncialCIF());
		System.out.println("\tIniciadas y terminadas "+dp.getAsignacionDeCostos().getPrecioIniciadasYterminadas());
		System.out.println("\tTOTAL COSTOS PT        "+dp.getAsignacionDeCostos().getTotalcostosProductoTerminado());
		System.out.println("Producto en proceso :");
		System.out.println("\tproducto en proceso             "+dp.getAsignacionDeCostos().getProductoEnProceso());
		System.out.println("\tMD                              "+dp.getAsignacionDeCostos().getProductoEnProcesoMD() );
		System.out.println("\tMOD                             "+dp.getAsignacionDeCostos().getProductoEnProcesoMOD() );
		System.out.println("\tCIF                             "+dp.getAsignacionDeCostos().getProductoEnProcesoCIF() );
		System.out.println("\tTOTAL COSTO PRODUCTO EN PROCESO "+dp.getAsignacionDeCostos().getTotalcostosProductoEnProceso());
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
