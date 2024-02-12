public class App {
    public static void main(String[] args) throws Exception {
        if(args.length > 0){
            try{
                int usrNum = Integer.parseInt(args[0]);
                if(usrNum > 0){
                    long f1=0,f2=1,f3=0;
                    for(int i=0;i<usrNum-2;i++){
                        f3 = f1 + f2;
                        f1 = f2;
                        f2 = f3;
                    }
                    if (f3 < 0) {
                        System.out.println("Fibanacci number is out of range:(4727).");
                    } else {
                        System.out.println("Fibanacci number " + usrNum + " = " + f3);
                    }
                }else{
                    System.out.println("Number must be positive.");
                }
                
            }catch(Exception e){
                System.out.println("Error in reading argument.");
            }

        }else{
            System.out.println("No number entered.");
        }
    }
}
