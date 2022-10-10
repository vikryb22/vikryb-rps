package games;

public class Player {
    private int score;
    private String name;
    //constructor

    public Player (String name, int score){

        this.name = name;
        this.score = score;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void rageQuit() {
        System.exit(0 );
    }

    @Override
    public String toString() {
        return "Name:"+ this.name+ ", Score:" + this.score;
    }
}

/*struktur på en klass
paket
importer
felt/fields
.
.
.
constructor-metod
getters
setters
metoder ( i lexikal ordning)
 */
