package management;

import java.util.ArrayList;

public class Enterpreneur {
    private Currency budget;
    ArrayList <Worker> workers = new ArrayList<Worker>();
    protected void addWorker(Worker w){
        workers.add(w);
    }
    protected void removeWorker(Worker w){
        workers.remove(w);
    }
    protected boolean changeBudget(Currency c, boolean plus){
        return budget.change(c, plus);
    }
    public Enterpreneur(Currency budget){
        super();
        this.budget = budget;
    }
    protected Currency getBudget(){
        return budget;
    }
}
