
/** 
*ArbClass This code is automatically generated by the MoBIT Tool
		@author Everton Leandro
**
*/
 public  class TestingQuizManager extends QuizManager {private  TestableQuiz server = null;
private  QuizTester tester = null;
private  Verdict verdict = null;
  public  void setTester ( QuizTester t){tester = t;;
}
 public  void setServer ( TestableQuiz s){server = s;;
}
 public  void performTest (){if((.server != null) && (.tester != null)){verdict = tester.executeTest(server);;

}else{

}

}
}




