class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String msg) {
        super(msg);
    }
}

class Voting {
    public static void main(String arg[]) {
        int age = 16;
        try {
            if( age < 18 ) {
                throw new YoungerAgeException("You are not eligible to vote");
            }else {
                System.out.print("You can vote");
            }
        }catch(YoungerAgeException e){
            // e.printStackTrace();
            System.out.println(e);
        }
    }
}