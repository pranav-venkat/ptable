package co.pranav.table;

public class question {
    String question;
    String answer;
    String op1;
    String op2;
    String op3;
    String q_template;
    int q_prop;
    int a_prop;
    int prop_id;
    int pro_id;


    static String[] questions = {"What is the name of the element whose symbol is %s ?",
            "What is the atomic number of %s?",
            "In which group is %s in ?",
            "What is the symbol of %s?",
            "What is the mass of %s?",
            "What is the density of %s in g/cc?",
            "How many oxidation states does %s have ?",
            "In which year was  %s  discovered ?",
            "What state is %s naturally found in?",
            "Which are the oxidation states of %s ?",
            "How much is the ionization energy of %s in eV?",
            "What is the atomic radius of %s ?",
            "The electron affinity of %s is:",
            "The electronegativity of %s is: ?",
            "What is the  electronic configuration of %s ?",
            "What is the melting point of %s in celsius?",
            "What is the boiling point of %s in celsius?"};


    static int[][] pairs = { {Ptable.SymbolId, Ptable.NameId},   {Ptable.NameId, Ptable.AtomicNumberId}, {Ptable.NameId, Ptable.GroupId},
            {Ptable.NameId, Ptable.SymbolId},{Ptable.NameId, Ptable.AtomicMassId}, {Ptable.NameId, Ptable.DensityId},  {Ptable.NameId, Ptable.OscId},
            {Ptable.NameId, Ptable.YearId}, {Ptable.NameId, Ptable.SsId}, {Ptable.NameId, Ptable.OsId}, {Ptable.NameId, Ptable.IonizationEnergyId}, {Ptable.NameId, Ptable.AtomicRadiusId},
            {Ptable.NameId, Ptable.ElectronAffinityId}, {Ptable.NameId, Ptable.ElectronegatvityId}, {Ptable.NameId, Ptable.ElectronicConfigurationId},
          {Ptable.NameId, Ptable.MeltingPointId}, {Ptable.NameId, Ptable.BoilingPointId}};




    public question(String qt, int qp, int ap ){
        this.q_template  =qt;
        this.q_prop = qp;
        this.a_prop = ap;
    }

    public question(int max){ // return a random question
        int[] rndm_pair = random_pair.random_pair(max, 0);
        int x = rndm_pair[0];
        int y;

        int[]rnd = random_pair.random_pair(116, 0);
        pro_id = rnd[0];
        int op1id  =rnd[1];
        int op2id = rnd[2];
        int op3id = rnd[3];
        if(max>5){
        int[]rand = random_pair.random_pair(116, 0);
        pro_id = rand[0];
         op1id  =rand[1];
         op2id = rand[2];
         op3id = rand[3];
        }
        else{
            int[]rndm = random_pair.random_pair(39, 0);
            pro_id = rndm[0];
             op1id  =rndm[1];
             op2id = rndm[2];
             op3id = rndm[3];
        }
        prop_id = (pro_id*(max+1))+pairs[x][0];

        String q;
        q = Ptable.get_property(pro_id, pairs[x][0]);
        String q1 = questions[x];

        this.question = String.format(q1, q);
        this.answer = Ptable.get_property(pro_id,pairs[x][1]);
        this.op1 = Ptable.get_property(op1id,pairs[x][1]);
        while( this.op1.equals(answer)){
            if(max>5){
            int[] rndm = random_pair.random_pair(116,0);
            y = rndm[0];}
            else{
                int[] rndm = random_pair.random_pair(39,0);
                y = rndm[0];
            }
            this.op1 = Ptable.get_property(y,pairs[x][1]);
        }
        this.op2 = Ptable.get_property(op2id,pairs[x][1]);
        while( this.op2.equals (answer)||this.op2.equals(this.op1) ){
            if(max>5){
                int[] rndm = random_pair.random_pair(116,0);
                y = rndm[0];}
            else{
                int[] rndm = random_pair.random_pair(39,0);
                y = rndm[0];
            }
            this.op2 = Ptable.get_property(y,pairs[x][1]);
        }
        this.op3 = Ptable.get_property(op3id,pairs[x][1]);
        while( op3.equals (this.op2 )|| op3 .equals (answer) || op3.equals (this.op1) ){
            if(max>5){
                int[] rndm = random_pair.random_pair(116,0);
                y = rndm[0];}
            else{
                int[] rndm = random_pair.random_pair(39,0);
                y = rndm[0];
            }
            this.op3 = Ptable.get_property(y,pairs[x][1]);
        }


    }

    public question(){ // return a random question
        int[]rnd = random_pair.random_pair(116, 0);
        int prop_id = rnd[0];
        int op1id  =rnd[1];
        int op2id = rnd[2];
        int op3id = rnd[3];
        int[] rndm_pair = random_pair.random_pair(16, 0);
        int x = rndm_pair[0];
        int y = rndm_pair[1];
        int z = rndm_pair[2];
        int a = rndm_pair[3];
        String q;
        q = Ptable.get_property(prop_id, pairs[x][0]);
        String q1 = questions[x];

        this.question = String.format(q1, q);
        this.answer = Ptable.get_property(prop_id,pairs[x][1]);
        this.op1 = Ptable.get_property(op1id,pairs[x][1]);
        while( this.op1.equals(answer)){
            int[] rndm = random_pair.random_pair(116,0);
            y = rndm[0];
            this.op1 = Ptable.get_property(y,pairs[x][1]);
        }
        this.op2 = Ptable.get_property(op2id,pairs[x][1]);
        while( this.op2.equals (answer)||this.op2.equals(this.op1) ){
            int[] rndm = random_pair.random_pair(116,0);
            y = rndm[0];
            this.op2 = Ptable.get_property(y,pairs[x][1]);
        }
        this.op3 = Ptable.get_property(op3id,pairs[x][1]);
        while( op3.equals (this.op2 )|| op3 .equals (answer) || op3.equals (this.op1) ){
            int[] rndm = random_pair.random_pair(116,0);
            y = rndm[0];
            this.op3 = Ptable.get_property(y,pairs[x][1]);
        }


    }



    public void question_fill(String question, String ans1, String ans2, String ans3, String ans4){
        this.question  =question;
        this.answer = ans1;
        this.op1 = ans2;
        this.op2 = ans3;
        this.op3 = ans4;

    }
}
