interface Clickable {
    void onClick();
}
public class Button {
    private Clickable action;
    
    void setClickAction(Clickable action){
        this.action = action;
    }
    
    void doClick(){
        action.onClick();
    }
}
public class Main {
    
    // membuat variabel di dalam class
    static String title = "Tutorial Anonymous Concept";

    public static void main(String[] args) {
        
        // membuat variabel di dalam method main
        String name = "Bylana98";
        
        Button btn = new Button();
        
        // membuat class anonymous untuk implemen interface
        btn.setClickAction(new Clickable() {
            // membuat variabel di dalam class anonymous
            String message = "belajar Anonymous Class di Java";
            
            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik!");
                System.out.println("Oukey!!!");
                // mengakses variabel
                System.out.println("Hello " + name);
                System.out.println(title);
                System.out.println(message);
            }

        });
        
        // mencoba klik tombol
        btn.doClick();
        
    }
}