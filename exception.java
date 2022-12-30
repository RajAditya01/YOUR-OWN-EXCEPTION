class Myexception extends Exception{
    String msg;
    Myexception(String s){
        msg=s;
    }
    public String toString(){
        return(msg);
    }
}

class Match{
    void matchstring(String str)throws Myexception
    {
        if(str.equalsIgnoreCase("Wellcome")){
            System.out.println("Nomatch exception occured");
        }
        else{
            throw new Myexception("Exception occurs");
        }

    }
}
class exception{
    public static void main(String[] args) {
        Match m=new Match();
        try{
            m.matchstring("Well");
    }
    catch(Myexception e){
        System.out.println(e);
    }
        
    }
}