package lab2;
import java.util.*;
import java.io.*;
import java.text.*;
import java.time.LocalTime;
public class Hospital {
	public static void main(String []args) throws ParseException, NumberFormatException, IOException{
		
		SimpleDateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
		Scanner scan = new Scanner(System.in);
		ArrayList <Paciente> listaPacientes = new ArrayList<>();
		ArrayList <Enfermedad> listaEnf = new ArrayList<>();
		ArrayList <Caso> listaCasos = new ArrayList<>();
		boolean salir = false;
		Paciente p1= new Paciente("Nelson Aluyis","Huaman","Apaza","72853331",datef.parse("09/05/1998"),Float.parseFloat("56.5"),Float.parseFloat("1.62"),"AQP-1");
		Paciente p2= new Paciente("Jose Perez","Mamani","Lopez","76878331",datef.parse("14/08/1988"),Float.parseFloat("78.9"),Float.parseFloat("1.70"),"AQP-2");
		Paciente p3= new Paciente("Eliot","Flores","Idme","73893035",datef.parse("21/11/1990"),Float.parseFloat("65.4"),Float.parseFloat("1.67"),"AQP-3");
		Paciente p4= new Paciente("Maribel Nelida","Huaman","Apaza","72905436",datef.parse("30/07/1968"),Float.parseFloat("50.2"),Float.parseFloat("1.50"),"AQP-4");
		listaPacientes.add(p1);
		listaPacientes.add(p2);
		listaPacientes.add(p3);
		listaPacientes.add(p4);
		Enfermedad e1=new Enfermedad("2","COVID-19","Viral");
		Enfermedad e2=new Enfermedad("3","VIH","Viral");
		Enfermedad e3=new Enfermedad("1","Colera","Bacteriana");
		Enfermedad e4=new Enfermedad("6","Tosferina","Bacteriana");
		Enfermedad e5=new Enfermedad("7","Fiebre Amarilla","Viral");
		Enfermedad e6=new Enfermedad("4","Malaria","Protozooaria");
		Enfermedad e7=new Enfermedad("5","Anemia","Bacteriana");
		listaEnf.add(e1);
		listaEnf.add(e2);
		listaEnf.add(e3);
		listaEnf.add(e4);
		listaEnf.add(e5);
		listaEnf.add(e6);
		listaEnf.add(e7);
		Caso c01 = new Caso("Anemia",datef.parse("10/05/2020"),Float.parseFloat("35.9"));
		Caso c02 = new Caso("Colera",datef.parse("09/03/2019"),Float.parseFloat("36.2"));
		Caso c03 = new Caso("Malaria",datef.parse("01/02/2020"),Float.parseFloat("37.6"));
		Caso c04= new Caso("Covid",datef.parse("11/04/2020"),Float.parseFloat("37.7"));
		p1.adCase(c02);
		p1.adCase(c04);
		p2.adCase(c01);
		p3.adCase(c03);
		
		int codp= listaPacientes.size();
		int code= listaEnf.size();
		while(!salir) {
			System.out.println(" **** MENU PRINCIPAL **** ");
            System.out.println(" 1 - Pacientes ");
            System.out.println(" 2 - Enfermedades");
            System.out.println(" 3 - Casos ");
            System.out.println(" 4 - Salir ");
            System.out.println("Seleccione una de las opciones");
            int opcion=Integer.parseInt(scan.nextLine());
            
            switch(opcion) {
            	case 1:
            		System.out.println(" **** PACIENTE **** ");
            		System.out.println(" 1 - Crear paciente ");
            		System.out.println(" 2 - Ver pacientes");
            		System.out.println(" 3 - Actualizar datos de un paciente ");
            		System.out.println(" 4 - Eliminar un paciente ");
            		System.out.println(" 5 - Volver al menu anterior ");
            		System.out.println("Seleccione una de las opciones");
                
            		int opaciente=Integer.parseInt(scan.nextLine());
            		switch(opaciente) {
            		case 1:
            			Paciente a = new Paciente();
            			System.out.println("Ingresar nombres ");
            			a.setNombres(scan.nextLine());
            			System.out.println("Ingresar apellido paterno ");
            			a.setPaterno(scan.nextLine());
            			System.out.println("Ingresar apellido materno ");
            			a.setMaterno(scan.nextLine());
            			System.out.println("Ingresar DNI ");
            			a.setDni(scan.nextLine());
            
            			System.out.println("Ingresar nueva Fecha de nacimiento (formato dd/mm/aaaa) ");
            			a.setNacimiento(datef.parse(scan.nextLine()));
            			
            			a.setCodigo("AQP-"+codp);
            			listaPacientes.add(a);
            			codp=codp+1;
            			
            			System.out.println("Paciente registrado correctamente...");
            			System.out.println("Si desea añadir mas datos ingrese al menu actualizar datos de un paciente");
            			break;
            		case 2:
            			System.out.println("Lista de pacientes registrados: "+"\n");
            			for(int i = 0; i < listaPacientes.size(); i++){ 
                            Paciente p =  listaPacientes.get(i); 
                            System.out.println((i+1)+". " + p.getNombres()+" "+p.getPaterno()+" "+p.getMaterno()); 
                            
            			}
            			break;
            		case 3:
            			System.out.println("ingrese Dni del paciente");
            			String dni = scan.nextLine();
            			for (int i = 0; i < listaPacientes.size(); i++) {
                            Paciente p = listaPacientes.get(i);
                            if(dni.equals(p.getDni())) {
                            	System.out.println("Ingresar nuevos nombres ");
                    			p.setNombres(scan.nextLine());
                    			System.out.println("Ingresar nuevo apellido paterno ");
                    			p.setPaterno(scan.nextLine());
                    			System.out.println("Ingresar nuevo apellido materno ");
                    			p.setMaterno(scan.nextLine());
                    			System.out.println("Ingresar nuevo DNI ");
                    			p.setDni(scan.nextLine());
                    			
                    			System.out.println("Ingresar peso ");
                    			p.setPeso(Float.parseFloat(scan.nextLine()));
                    			System.out.println("Ingresar talla ");
                    			p.setTalla(Float.parseFloat(scan.nextLine()));
                    			
                            }
                            
            			}
            			System.out.println("Datos actualizados correctamente...");
            			
            			
            			break;
            		case 4:
            			System.out.println("Ingreser la DNI del paciente a eliminar ");
                        String patente = scan.nextLine();
                        
                        for (int i = 0; i < listaPacientes.size(); i++) {
                            Paciente pa = listaPacientes.get(i);
                            
                            if (patente.equals(pa.getDni())) {
                               
                                listaPacientes.remove(i);
                                
                            }
                        }
                        System.out.println("Paciente eliminado correctamente...");
                        break;
            		case 5:
            			break;
            	}
            	System.out.println();
            	break;
            	case 2:
            		System.out.println(" **** ENFERMEDADES **** ");
            		System.out.println(" 1 - Crear enfermedad ");
            		System.out.println(" 2 - Ver enfermedades");
            		System.out.println(" 3 - Actualizar datos de una enfermedad ");
            		System.out.println(" 4 - Eliminar una enfermedad ");
            		System.out.println(" 5 - Volver al menu anterior ");
            		System.out.println("Seleccione una de las opciones");
            		
            		int enf=Integer.parseInt(scan.nextLine());
            		switch(enf) {
            			case 1:
            				Enfermedad e = new Enfermedad();
            				
                			System.out.println("Ingresar Nombre de la enfermedad");
                			e.setNombre(scan.nextLine());
                			System.out.println("Ingresar tipo de enfermedad ");
                			e.setTipo(scan.nextLine());
                			code=code+1;
                			e.setCodigo(""+code);
                			System.out.println("se a creado la enfermedad "+e.getNombre()+" cuyo codigo sera:"+code);
                			listaEnf.add(e);
                			break;
            			case 2:
            				System.out.println("Lista de enfermedades registradas: "+"\n");
                			for(int i = 0; i < listaEnf.size(); i++){ 
                                Enfermedad en =  listaEnf.get(i); 
                                
                                System.out.println(en.getCodigo()+" "+en.getNombre()); 
                			}
                			break;
            				
            			case 3:
            				System.out.println("ingrese codigo");
                			String cod = scan.nextLine();
                			for (int i = 0; i < listaEnf.size(); i++) {
                                Enfermedad enfe = listaEnf.get(i);
                                if(cod.equals(enfe.getNombre())) {
                        			System.out.println("Ingresar nuevo nombre de enfermedad ");
                        			enfe.setNombre(scan.nextLine());
                        			System.out.println("Ingresar nuevo tipo de enfermedad ");
                        			enfe.setTipo(scan.nextLine());
                                }
                			}
                			System.out.println("Datos actualizados correctamente..."+"\n");
                			break;
            			case 4:
            				System.out.println("Ingrese el codigo de la enfermedad a eliminar ");
                            String nom = scan.nextLine();
                            
                            for (int i = 0; i < listaEnf.size(); i++) {
                                Enfermedad el = listaEnf.get(i);
                                
                                if (nom.equals(el.getCodigo())) {
                                   
                                    listaEnf.remove(i);
                                    System.out.println("Enfermedad eliminada satisfactoriamente..."+"\n");
                                }
                            }
                            
                            break;
            			case 5:
            				System.out.println("volviendo al menu anterior...");
                			break;
            				
            	}
            	System.out.println();
            	break;
            	case 3:
            		System.out.println(" **** CASOS **** ");
            		System.out.println(" 1 - Crear un caso ");
            		System.out.println(" 2 - Ver casos");
            		System.out.println(" 3 - Actualizar datos de un caso ");
            		System.out.println(" 4 - Eliminar un caso ");
            		System.out.println(" 5 - Volver al menu anterior ");
            		System.out.println("Seleccione una de las opciones");
            		
            		int c = Integer.parseInt(scan.nextLine());
            		switch(c) {
            			case 1:
            				
            				System.out.println("Ingresar DNI:");
            				String id=scan.nextLine();
            				int num=1;
            				for (int i = 0; i < listaPacientes.size(); i++) {
                                Paciente p = listaPacientes.get(i);
                                
                                if(id.equals(p.getDni())){
                                	
                                	Caso ca = new Caso();
                    				
                        			
                        			ca.setNumdc(num);
                                	System.out.println("Hola "+p.getNombres());
                                	System.out.println("ingrese Fecha (formato dd/mm/aaaa)");
                                	ca.setHorafecha(datef.parse(scan.nextLine()));
                                	System.out.println("enfermedad");
                                	String idE=scan.nextLine();
                                	
                                	for (int j = 0; i < listaEnf.size(); i++) {
                                        Enfermedad f = listaEnf.get(i);
                                        if(idE.equals(f.getCodigo())){
                                        	ca.setEnfermedad(f.getNombre());
                                        	System.out.println(f.getNombre()+"registrado al paciente"+ p.nombres);
                                        }
                                	}
                                	
                                	System.out.println("**quiere ingresar temperatura y saturacion**");
                        			System.out.println(" 1 - si ");
                            		System.out.println(" 2 - no");
                            		int mas = Integer.parseInt(scan.nextLine());
                            		switch(mas) {
                            			case 1:
                            				System.out.println("Ingresar temperatura");
                                			ca.setTemperatura(Float.parseFloat(scan.nextLine()));
                                			System.out.println("Ingresar saturacion de oxigeno");
                                			ca.setSaturacion(Double.parseDouble(scan.nextLine()));
                                			break;
                            			case 2:
                            				break;
                            			default:
                            				System.out.println("opcion invalida");
                            					
                            		}
                            		num=num+1;
                            		p.adCase(ca);
                                
                                }
                			}
            				
                			
                    		System.out.println("\n"+"caso registrado correctamente..."+"\n");
                    		break;
            			case 2:
            				System.out.println("Lista de casos registrados por paciente ");
                			for(int i = 0; i < listaPacientes.size(); i++){ 
                                Paciente pP =  listaPacientes.get(i);   
                                if(pP.casosP.size()>=1) {
                                	System.out.println(pP.getNombres()+":");
                                	for(int j=0;j<pP.casosP.size();j++) {
                                		Caso ace=pP.casosP.get(j);
                                		System.out.println(ace.getEnfermedad()+" - "+datef.format(ace.getHorafecha()));
                                	}
                                }
                			}
                			break;
            			case 3:
            				System.out.println("ingrese el DNI de la persona a modificar su caso ");
            				String idm=scan.nextLine();
            				for(int i = 0; i < listaPacientes.size(); i++){ 
                                Paciente en =  listaPacientes.get(i);   
                                if(idm.equals(en.getDni())) {
                                	System.out.println("hola: "+en.getNombres()+" usted tiene "+en.casosP.size()+" casos registrados");
                                	System.out.println("Ingresar numero de caso a modificar ");
                        			int mod = scan.nextInt();
                        			for(int j=0;j<en.casosP.size();j++) {
                        				Caso modC=en.casosP.get(j);
                        				if(mod == modC.getNumdc()) {
                        					System.out.println("Ingresar nueva enfermedad");
                                			modC.setEnfermedad(scan.nextLine());
                        					System.out.println("Ingresar nueva temperatura");
                                			modC.setTemperatura(Float.parseFloat(scan.nextLine()));
                                			System.out.println("Ingresar nueva saturacion de oxigeno");
                                			modC.setSaturacion(Double.parseDouble(scan.nextLine()));
                        					
                        				}
                        			}
                                }
                               
                			}
            				System.out.println("\n"+"caso actualizado correctamente..."+"\n");
            				break;
            			case 4:
            				System.out.println("ingrese el DNI de la persona a modificar su caso ");
            				String idn=scan.nextLine();
            				for(int i = 0; i < listaPacientes.size(); i++){ 
                                Paciente en =  listaPacientes.get(i);   
                                if(idn.equals(en.getDni())) {
                                	System.out.println("hola: "+en.getNombres()+" usted tiene "+en.casosP.size()+" casos registrados");
                                	System.out.println("Ingresar numero de caso a modificar ");
                        			int mod = scan.nextInt();
                        			for(int j=0;j<en.casosP.size();j++) {
                        				Caso modC=en.casosP.get(j);
                        				if(mod == modC.getNumdc()) {
                        					en.casosP.remove(mod);
                        					
                        				}
                        			}
                                }
                               
                			}
            				System.out.println("\n"+"caso eliminado correctamente..."+"\n");
            				break;
            			case 5:
            				break;
            				
            				
            		}
            		break;
            	case 4:salir = true;
                System.out.println("Saliendo del programa");
                break;	
            	default:
            		System.out.println("\n"+"opcion invalida"+"\n");
            }
            
		}
		
		FileWriter fichero = new FileWriter("C:/Users/Aluyis/Games/FP2-P_A_LAB_02_reporte.txt");
		fichero.write("LISTA DE PACIENTES REGISTRADOS:"+"\n"+"\n");
		ArrayList<String> pacientes = new ArrayList<>();
		for(int i = 0; i < listaPacientes.size(); i++){ 
            Paciente p =  listaPacientes.get(i); 
            pacientes.add(p.getNombres()+" "+p.getPaterno()+" "+p.getMaterno()); 
		}
		Collections.sort(pacientes);
		for(int i = 0; i < pacientes.size(); i++){ 
			fichero.write((i+1)+". "+pacientes.get(i)+"\n"); 
		}
		fichero.write("\n"+"LISTA DE ENFERMEDADES REGISTRADAS "+"\n"+"\n");
		ArrayList<String> enfermedades = new ArrayList<>();
		for(int i = 0; i < listaEnf.size(); i++){ 
            Enfermedad e =  listaEnf.get(i); 
            enfermedades.add(e.getNombre()); 
		}
		Collections.sort(enfermedades);
		for(int i = 0; i < enfermedades.size(); i++){             
            fichero.write((i+1)+". "+enfermedades.get(i)+"\n"); 
		}
	
		ArrayList <String> cases= new ArrayList<>();
		for(int i = 0; i < listaPacientes.size(); i++){ 
            Paciente pP =  listaPacientes.get(i);   
            if(pP.casosP.size()>=1) {
            	cases.add(pP.getNombres());
            }  
		}
		Collections.sort(cases);
		 
		fichero.write("\n"+"LISTA DE CASOS REGISTRADOS POR NOMBRE Y FECHA"+"\n"+"\n");
		for(int n=0;n<cases.size();n++) {
			for(int i = 0; i < listaPacientes.size(); i++){ 
	            Paciente pP =  listaPacientes.get(i);
	            if(cases.get(n).equals(pP.nombres)) {
	            	
	            	fichero.write(pP.getNombres()+" "+pP.getPaterno()+" "+pP.getMaterno()+": "+"\n");
	            	ArrayList<String> fecha=new ArrayList<>();
	            	for(int j=0;j<pP.casosP.size();j++) {
	            		Caso ace=pP.casosP.get(j);
	            		fecha.add(datef.format(ace.getHorafecha())+" - "+ace.getEnfermedad());         		
	            	}
	            	Collections.sort(fecha);
	            	for(int k = fecha.size()-1; k >= 0; k--){             
	                    fichero.write(fecha.get(k)+"\n"); 
	        		}
	            	fichero.write("\n");
	            }	       
			}
		}
		
		fichero.close();	
	}

}
