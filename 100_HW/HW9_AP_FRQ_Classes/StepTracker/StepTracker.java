import java.util.*;    
    
    public class StepTracker{
        int days;
        double steps;
        
        public StepTracker(){
            days = 1;
            steps = 10000.0;
        }
        public StepTracker(double steps){
            this.days = 1;
            this.steps = steps;
        }
        public void addDailySteps(double newsteps){
            this.steps = this.steps + newsteps;
            this.days++;
        }
        public int activeDays(){
            return this.days;
        }
        public double averageSteps(){
            double average = this.steps / this.days;
            return average;
        }

    
    
    
        
}