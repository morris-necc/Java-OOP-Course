public class Ascended {
    public static void main(String args[]){
        long[] id = {2440102493L, 2440105785L, 2440061285L, 2440100273L, 2440065163L};
        String[] names = {"Raffles Teh Weihan", "Hassan Mohamed Hasan", "Monique Senjaya", "Ariel Putra", "Ardelia Shaula Araminta"};
        String[] colors = {"Green", "Red", "Blue", "Yellow", "Black"};
        String key1, key2;
        long key3;
        int j;
        // insertion sort info according to their name
        for(int i = 1; i < names.length; i++){
            key1 = names[i];
            key2 = colors[i];
            key3 = id[i];
            j = i - 1;
            while(j >= 0 && names[j].compareTo(key1) > 0){
                names[j+1] = names[j];
                colors[j+1] = colors[j];
                id[j+1] = id[j];
                j--;
            }
            names[j+1] = key1;
            colors[j+1] = key2;
            id[j+1] = key3;
        }
        //print
        System.out.println("Sorted by name");
        System.out.println();
        for(int i = 0; i < names.length; i++){
            System.out.println(id[i] + " | " + names[i] + " | " + colors[i]);
        }
        System.out.println("=============================================");
        System.out.println();

        // insertion sort info according to their colour
        for(int i = 1; i < colors.length; i++){
            key1 = names[i];
            key2 = colors[i];
            key3 = id[i];
            j = i - 1;
            while(j >= 0 && colors[j].compareTo(key2) > 0){
                names[j+1] = names[j];
                colors[j+1] = colors[j];
                id[j+1] = id[j];
                j--;
            }
            names[j+1] = key1;
            colors[j+1] = key2;
            id[j+1] = key3;
        }
        //print
        System.out.println("Sorted by color");
        System.out.println();
        for(int i = 0; i < names.length; i++){
            System.out.println(id[i] + " | " + names[i] + " | " + colors[i]);
        }
    }
}
