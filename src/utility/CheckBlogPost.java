package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	public boolean checkBlog(Blog blog) {
		boolean result1=checkBlogTitle(blog);
		boolean result2=checkBlogDescription(blog);
		if(result1==true && result2==true ) {
			return true;
		}
		else {return false;}
	}
    String [] offensiveWord = {"areole","arian","arrse","arse","arsehole","aryan","ass","ass fuck","ass fuck" ,"ass hole" ,"assbag" ,"assbandit" ,"assbang","assbanged" ,"assbanger","assbangs" ,"assbite"
                                 ,"assclown"
                                 ,"asscock"
                                 ,"asscracker"
                                 ,"asses"
                                 ,"assface"
                                 ,"assfaces"
                                 ,"assfuck"
                                 ,"assfucker"
                                 ,"ass-fucker"};
	public boolean checkBlogTitle(Blog blog) {
		//boolean isOffensive=false;
	    for(int i=0;i<25;i++) {
	    	if(blog.getBlogTitle().contains(offensiveWord[i])) {
	    		return false;
	    	}
	    }
	    return true;
	}
    public boolean checkBlogDescription(Blog blog) {
    	for(int i=0;i<25;i++) {
	    	if(blog.getBlogDescription().contains(offensiveWord[i])) {
	    		return false;
	    	}
	    }
	    return true;
    }
}
