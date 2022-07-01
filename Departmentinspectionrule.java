package visitingrule;

import departments.*;
import visitors.*;

public class Departmentinspectionrule implements Departmentvisitor {
	
	public int visit(Medi mdd) {
		int score = 0;
		if(mdd.getstudent()==0) {
			score = 0;
			
		}
		else if ( mdd.getstudent()>0 & mdd.getstudent() <100) {
			score -= 20;
		} else {
			score += 10;
		}
		if(mdd.getworker()==0) {
			score = 0;
			
		}
		else if (mdd.getworker()>0 &  mdd.getworker() < 20) {
			score -= 5;
		} else {
			score += 15;
		}
		System.out.println("Score of Medical department is  " + score);
		return score;
	}

	public int visit(Arts add) {
		int score = 0;
		if(add.getstudent()==0) {
			score = 0;
			
		}
		else if ( add.getstudent()>0 & add.getstudent() <100) {
			score -= 20;
		} else {
			score += 10;
		}
		if(add.getworker()==0) {
			score = 0;
			
		}
		else if (add.getworker()>0 &  add.getworker() < 20) {
			score -= 5;
		} else {
			score += 15;
		}
		System.out.println("Score of Arts department is  " + score);
		return score;
	}

	@Override
	public int visit(Busi bdd) {
		int score = 0;
		if(bdd.getstudent()==0) {
			score = 0;
			
		}
		else if ( bdd.getstudent()>0 & bdd.getstudent() <100) {
			score -= 20;
		} else {
			score += 10;
		}
		if(bdd.getworker()==0) {
			score = 0;
			
		}
		else if (bdd.getworker()>0 &  bdd.getworker() < 20) {
			score -= 5;
		} else {
			score += 15;
		}
		System.out.println("Score of Bussines department is  " + score);
		return score;
	}

	@Override
	public int visit(Comm cdd) {
		int score = 0;
		if(cdd.getstudent()==0) {
			score = 0;
			
		}
		else if ( cdd.getstudent()>0 & cdd.getstudent() <100) {
			score -= 20;
		} else {
			score += 10;
		}
		if(cdd.getworker()==0) {
			score = 0;
			
		}
		else if (cdd.getworker()>0 &  cdd.getworker() < 20) {
			score -= 5;
		} else {
			score += 15;
		}
		System.out.println("Score of Commerce department is  " + score);
		return score;
	}

	@Override
	public int visit(Sci sdd) {
		int score = 0;
		if(sdd.getstudent()==0) {
			score = 0;
			
		}
		else if ( sdd.getstudent()>0 & sdd.getstudent() <100) {
			score -= 20;
		} else {
			score += 10;
		}
		if(sdd.getworker()==0) {
			score = 0;
			
		}
		else if (sdd.getworker()>0 &  sdd.getworker() < 20) {
			score -= 5;
		} else {
			score += 15;
		}
		System.out.println("Score of Science department is  " + score);
		return score;
	}
	

}