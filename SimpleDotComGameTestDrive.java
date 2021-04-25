public class  SimpleDotComGameTestDrive {
    
    int[] locations = {2,3,4};

    public void Main (String args[]){
        
        SimpleDotCom dot = new SimpleDotCom();

        dot.setLocations(locations);

        String userGuess= "2";

        String result = dot.checkYourself(userGuess);

        String testResult = "failed";

        if (result.equals("hit")) {

            testResult = "passed";

        }

        System.out.println(testResult);
    }
}
