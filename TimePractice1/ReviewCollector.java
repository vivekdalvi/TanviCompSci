package TimePractice1;

import java.util.ArrayList;


public class ReviewCollector {

    private ArrayList<ProductReview> reviewList;
    private ArrayList<String>productList;

    public ReviewCollector()
    {
        reviewList = new ArrayList<ProductReview>();
        productList = new ArrayList<String>();

    }

    public void addReview(ProductReview prodReview)
    {
        reviewList.add(prodReview);
        boolean addreview = true;
        for (ProductReview p : reviewList) 
        {
            if(prodReview.getName() == p.getName())
            {
                addreview = false;
            }
        }            
        if (addreview == true)
        {
            productList.add(prodReview.getName());
        }
        
    }

    public int getNumGoodReviews(String prodName)
    {
        int goodreview = 0;
        for (int i = 0; i < reviewList.size(); i++)
        {
            ProductReview pr = reviewList.get(i);
            if(prodName.equals(pr.getName()) == true)
            {
               
            }
        }  


        return goodreview;
    }


}