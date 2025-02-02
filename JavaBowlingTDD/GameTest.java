import org.junit.*;                      // JUNIT 4: f�r alle Anotationen
import static org.junit.Assert.*;        // JUNIT 4: f�r alle assert-Methoden
import org.junit.runner.*;               // JUNIT 4: f�r JUnitCore und Result
import org.junit.runner.notification.*; // JUNIT 4: f�r Failure 

public class GameTest {
  
        private Game game;
        
        @Before
        public void initTest() {
               game = new Game();
        }
        
        private int doTheGame(int[] rolls) {
                int frameIndex = 0;
                int rollIndex = 0;
                while( (game.getRound() < 10)) {
                   game.addRoll(rolls[frameIndex+rollIndex]);
                   rollIndex++;
                   if (rollIndex >= 1) {
                      rollIndex = 0;
                      frameIndex+= 2;
                      game.pushFrame();
                   }
                }
                return 0;
        }
        
        private void printFrames() {
        }
        
        @Test
        public void testRegularGame1() {
               int[] rolls = {1,4,4,5,6,4,5,5,10,0,1,7,3,6,4,10,2,8,6};
               assertEquals(133,doTheGame(rolls));
        }
        
        public static void main(String[] args) {
               Result result = JUnitCore.runClasses(GameTest.class);
               printTUI(result);
        }
  
        public static void printTUI(Result result) {
               System.out.println("Time: " + result.getRunTime() + "ms");
               System.out.println("Number of Tests: " + result.getRunCount());
               System.out.println("Failed: " + result.getFailureCount());
               for (Failure f: result.getFailures()) {
                   System.out.println(f.toString());
        } 
}
}