
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat eusk_formato = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat cast_formato = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat ingl_formato = new SimpleDateFormat("yyyy/dd/MM");
		
		Date fecha1 = eusk_formato.parse("2017/02/24");
		Date fecha2 = cast_formato.parse("01/03/2017");
		Date fecha3 = ingl_formato.parse("2017/05/01");
		Date carnaval = cast_formato.parse("28/02/2017");
		Date cumpleaños = cast_formato.parse("15/11/2017");
		System.out.println("Fecha3: " + fecha3.toString());
		
		System.out.println("Fecha1 " + eusk_formato.format(fecha1));
		System.out.println("Fecha2 " + cast_formato.format(fecha2));
		System.out.println("Fecha3 " + ingl_formato.format(fecha3));
		
		System.out.println("Comparando fechas...: ");
		
		if(fecha1.before(fecha2)){
			System.out.println("Fecha1 anterior a Fecha2");
		}else{
			System.out.println("Fecha1 posterior a Fecha2");
		}
		
		if(fecha2.after(fecha3)){
			System.out.println("Fecha2 posterior a Fecha3");
		}else{
			System.out.println("Fecha2 anterior a Fecha3");
		}	
		
		System.out.println("Tiempo real...:");
		Date ahora = new Date(); //Tiempo real
		
		GregorianCalendar gc1 = new GregorianCalendar();
		gc1.setTime(fecha1);
		
		GregorianCalendar gc2 = new GregorianCalendar();
		gc2.setTime(fecha2);	
		System.out.println("fecha2 'dd/MM/yyyy' formato: " + cast_formato.format(gc2.getTime()));
		
		
		
		System.out.println("Realizando operaciones con las fechas...:");
		int dias = (int) ((fecha2.getTime()- fecha1.getTime())/(1000*24*60*60));
		System.out.println("fecha2 - fecha1 : " + dias);
	
		
		SimpleDateFormat sdf_completo = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println("Fecha de ahora: " + sdf_completo.format(new Date()));
		
				
		dias = (int) ((carnaval.getTime() - ahora.getTime())/(1000*24*60*60));
		System.out.println("Dias restantes para Carnaval!!: " + dias);
		
		System.out.println("Introduce una fecha:");
		Scanner scan = new Scanner(System.in);
		String fecha = scan.nextLine();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha_result = df.parse(fecha);
		
		dias = (int) ((cumpleaños.getTime() - fecha_result.getTime())/(1000*24*60*60));
		System.out.println("Dias restantes para mi cumple!!: " + dias + " dias");
					
	}
}
