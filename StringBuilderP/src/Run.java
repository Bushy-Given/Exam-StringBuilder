
public class Run {

	public static void main(String[] args) {
        StringBuilder stringBuilder =  new StringBuilder("Bushy");
        stringBuilder.append("-");
        stringBuilder.append("Given");
        
        char[] names = {'B','U','S','H','Y'};
        System.out.println(stringBuilder);
       
        String name = "Bushy";      
        System.out.println("Bushy"==name);
        boolean isFound = false;
        if(names.equals(name)) {
        	isFound = true;	
        }
        System.out.println(isFound);
	}

}
