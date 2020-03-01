package by.it.kuzmichalex.jd01_08;

/**
 * Base class for task 7
 * */
abstract class Var implements Operation {

    /**
     * override Object.toString method
     * */
    @Override
    public String toString(){
        return("abstract class Var");
    }

    /////////// Methods for add operation
    @Override
    public Var add(Var rightOperand) {
        System.out.println("Var.add var" + rightOperand);
        return null;
    }
    public Var add(Scalar leftOperand){
        System.out.println("Var.add Scalar " + leftOperand  +" + " + this + " Не существует");
        return null;
    }
    public Var add(Vector leftOperand){
        System.out.println("Var.add Vector " + leftOperand  +" + " + this + " Не существует");
        return null;
    }
    public Var add(Matrix leftOperand){
        System.out.println("Var.add Matrix " + leftOperand  +" + " + this + " Не существует");
        return null;
    }

    /////////// Methods for sub operation
    @Override
    public Var sub(Var rightOperand) {
        System.out.println("Var.add var" + rightOperand);
        return null;
    }
    public Var sub(Scalar leftOperand){
        System.out.println("Var.add Scalar " + leftOperand  +" - " + this + " Не существует");
        return null;
    }
    public Var sub(Vector leftOperand){
        System.out.println("Var.add Vector " + leftOperand  +" - " + this + " Не существует");
        return null;
    }
    public Var sub(Matrix leftOperand){
        System.out.println("Var.add Matrix " + leftOperand  +" - " + this + " Не существует");
        return null;
    }

    /////////// Methods for mul operation
    @Override
    public Var mul(Var rightOperand) {
        System.out.println("Var.mul var" + rightOperand);
        return null;
    }
    public Var mul(Scalar leftOperand){
        System.out.println("Var.mul Scalar " + leftOperand  +" * " + this + " Не существует");
        return null;
    }
    public Var mul(Vector leftOperand){
        System.out.println("Var.mul Vector " + leftOperand  +" * " + this + " Не существует");
        return null;
    }
    public Var mul(Matrix leftOperand){
        System.out.println("Var.mul Matrix " + leftOperand  +" * " + this + " Не существует");
        return null;
    }
    /////////// Methods for div operation
    @Override
    public Var div(Var rightOperand) {
        System.out.println("Var.div var" + rightOperand);
        return null;
    }
    public Var div(Scalar leftOperand){
        System.out.println("Var.div Scalar " + leftOperand  +" / " + this + " Не существует");
        return null;
    }
    public Var div(Vector leftOperand){
        System.out.println("Var.div Vector " + leftOperand  +" / " + this + " Не существует");
        return null;
    }
    public Var div(Matrix leftOperand){
        System.out.println("Var.div Matrix " + leftOperand  +" / " + this + " Не существует");
        return null;
    }
}
