public class Runner {

    private String name;

    Runner(String name){
        this.name = name;
    }

    public void doit(){
        for(int i = 0; i < 7; i++){
            System.out.println("Schleife " + i + ' ' + name);
            // System.out.println(((Object) this).hashCode());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
