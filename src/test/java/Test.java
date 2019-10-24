		//import junit.framework.Assert;
                import org.junit.Ignore;
                import org.junit.Test;
                import java.util.Random;
		            import org.junit.Assert;
                                
                /**  
                 * Created by dshmaya on 15/11/2017 ...04
                */  
                public class Test {
			
		public void sometimesPass48()
    		{

			 Random random = new Random();
			 int randomNumber = random.nextInt(100);
			 boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
			 Assert.assertEquals(smallerThanFiftee, true);
			try {
			    Assert.assertEquals(true, true);
			}catch (NullPointerException w){
		}
		
                  
                public void sometimesPass46()
    		{
			 Random random = new Random();
			 int randomNumber = random.nextInt(100);
			 boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
			 Assert.assertEquals(smallerThanFiftee, true);
			try {
			    Assert.assertEquals(true, true);
			}catch (NullPointerException w)
		}
   
		public void sometimesPass47()
	    	{

			 Random random = new Random();
			 int randomNumber = random.nextInt(100);
			 boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
			 Assert.assertEquals(smallerThanFiftee, true);
			try {
			    Assert.assertEquals(true, true);
			}catch (NullPointerException w){}
		
		}
                                
                   @Test  
                   public void alwaysPass1()
                   {
                       Assert.assertEquals(1, 1);
			int randomNumber = random.nextInt(100);
			   try {
            		Assert.assertEquals(true, true);
        		}catch (NullPointerException w){}
                   }
                

                   @Test
                    public void alwaysPass2()
                    {
                        Assert.assertEquals(1, 2);
                    }
			
		    public void Password()
                    {
			String password = "test.123";
                        try {
			    Assert.assertEquals(password, "Test123.");
			}catch (NullPointerException w){}
                    }
                   @Test  
                   public void alwaysPass3()
                   {
                       Assert.assertEquals(1, 1);
                   }
                  
                  @Test
                    public void alwaysPass4()
                    {
                        Assert.assertEquals(1, 1);
                    }
                   @Test
                   public void alwaysFail5()
                   {
                       Assert.assertEquals(1, 2);
                   }


                  @Test
                    public void alwaysPass6()
                    {
                        Assert.assertEquals(1, 1);
                    }
                  @Test
                    public void alwaysPass7()
                    {
                        Assert.assertEquals(1, 1);
                    }
                 @Test
                   public void alwaysFail81()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  @Test
                   public void alwaysFail91()
                   {
                       Assert.assertEquals(1, 2);
                   }

                  @Test
                   public void alwaysFail10()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  @Test
                   public void alwaysFail11()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  @Test
                   public void alwaysFail12()
                   {
                       Assert.assertEquals(1, 1);
                   }
                  
                  @Test
                   public void alwaysFail13()
                   {
                       Assert.assertEquals(1, 1);
                   }
                  
                    @Test
                    
                    public void ignored1()
                    {
                        Random random = new Random();
                        int randomNumber = random.nextInt(99);
                        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
                        Assert.assertEquals(smallerThanFiftee, true); 
// 			    try {
//             		Assert.assertEquals(true, true);
//         		}catch (NullPointerException w){}
                    }
                                
                    @Test
			    
                    public void ignored2()
                    {
                        Random random = new Random();
                        int randomNumber = random.nextInt(100);
                        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
                        Assert.assertEquals(smallerThanFiftee, true);
// 			Assert.assertEquals(true, true);
//         		}catch (NullPointerException w){
//                     }
                }
     }
