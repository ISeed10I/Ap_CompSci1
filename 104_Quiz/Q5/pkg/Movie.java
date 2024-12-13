package pkg;

public class Movie{
    String MovieName;
    double Score;
    int Numofratings;
    int revenue;
    public Movie(){
        this.MovieName = "Avengers";
        this.Score = 8.0;
        this.Numofratings = 33;
        this.revenue = 623357910;
        
    }
    public Movie(String MovieName, double Score, int Numofratings,int revenue){    
        this.MovieName = MovieName;
        this.Score = Score;
        this.Numofratings = Numofratings;
        this.revenue = revenue;
    }
    
    public void movieToString(){
        System.out.println("Movie : "+ this.MovieName);
        System.out.println("Rating : "+ this.Score);
        System.out.println("Number of ratings : " + this.Numofratings);
        System.out.println("Revenue : " + this.revenue);
        System.out.println("                           ");
    }
    public String getMovieName(){
        return this.MovieName;
    }
    public int getRevenue(){
        return this.revenue;
    }
    public double getRating(){
        return Score;
    }
    public String revenueToString(){
    int b = 0;
    int timecheck = this.getRevenue();

        int checkl = timecheck%1000;
        int check2 = ((timecheck%1000000)-checkl)%;
        
        String rev2 = check2 + ","+checkl;
        return rev2;
        
    }
    public void addRating(double newrating){
        this.Score = this.Score*Numofratings;
        this.Numofratings = this.Numofratings + 1;
        this.Score = this.Score+newrating;
        this.Score = this.Score/Numofratings;
    }
    public boolean compareRatings(Movie b){
    
        if(this.Score > b.getRating()){
            return true;
        }
        return false;
    }
    
}
