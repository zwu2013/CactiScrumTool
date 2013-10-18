package org.cacti.scrumtool.client;

import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.VLayout;
 
public class MainArea extends VLayout 
{
     
    private Label label;
     
    public MainArea() 
    {
         
        super();
 
        label = new Label();
        label.setContents("Main Area");
        label.setAlign(Alignment.CENTER);
        label.setOverflow(Overflow.HIDDEN);

        this.addMember(label);
        
    }
}
