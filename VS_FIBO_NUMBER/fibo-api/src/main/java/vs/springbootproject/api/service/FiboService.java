package vs.springbootproject.api.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class FiboService {
	
	
	public ArrayList<Integer> findNumber(@PathVariable int number) throws IOException {
		ArrayList<Integer> fibnumbers = new ArrayList<Integer>();
		int t1 = 0, t2 = 1;
		int sum = 0;
		String num = "";
		
        System.out.print("First " + number + " terms: ");
        for (int i = 1; i <= number; ++i)
        {
           
        	num = t1 + " + ";
            fibnumbers.add(t1);
            System.out.print(num);
              sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            
            
        }
        
       return fibnumbers;
	}

}
