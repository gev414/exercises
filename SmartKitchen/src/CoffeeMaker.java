public class CoffeeMaker{
    private boolean hasWorkToDo;
    protected void brewCoffee(){
        if (hasWorkToDo) System.out.println("Brewing Coffee");
        hasWorkToDo=false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

}
