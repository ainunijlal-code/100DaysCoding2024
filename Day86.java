public class Main {
	public static void main(String[] args) {
		
		String kata[] = {"java", "day", "86"};

        System.out.println("cetak for-each :");
        for (String a : kata) {
            System.out.println(a);
            
                }
                
                System.out.println("cetak menggunakan for :");
        for (int i = 0; i < kata.length; i++) {
            System.out.println("array[" + i + "]: " + kata[i]);
        }
	}
}
