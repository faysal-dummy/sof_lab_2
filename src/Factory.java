public class Factory {
    private static Factory ins = null ;
    private Factory(){}

    public static Factory getInstance(){
        if(ins == null) ins = new Factory() ;
        return  ins ;
    }
    public shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rect();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
