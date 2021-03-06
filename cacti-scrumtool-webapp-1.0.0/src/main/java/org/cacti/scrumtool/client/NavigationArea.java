package org.cacti.scrumtool.client;

import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.types.VisibilityMode;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.SectionStack;
import com.smartgwt.client.widgets.layout.SectionStackSection;

public class NavigationArea extends HLayout 
{
    public NavigationArea() {
         
        super();
        
        this.setMembersMargin(20); 
        this.setOverflow(Overflow.HIDDEN);
        this.setShowResizeBar(true);
         
        final SectionStack sectionStack = new SectionStack(); 
        sectionStack.setVisibilityMode(VisibilityMode.MULTIPLE);
        sectionStack.setShowExpandControls(true);
        sectionStack.setAnimateSections(true);
        sectionStack.setVisibilityMode(VisibilityMode.MUTEX);
        sectionStack.setOverflow(Overflow.HIDDEN);
         

        SectionStackSection section1 = new SectionStackSection("Section 1");
        section1.setExpanded(true);
        Label label1 = new Label();
        label1.setContents("Label1");
        section1.addItem(label1);
         
        SectionStackSection section2 = new SectionStackSection("Section 2");
        section2.setExpanded(false);
        Label label2 = new Label();
        label2.setContents("Label2");
        label2.setOverflow(Overflow.AUTO);
        label2.setPadding(10);
        section2.addItem(label2);
 
        SectionStackSection section3 = new SectionStackSection("Section 3");
        section3.setExpanded(false);
        Label label3 = new Label();
        label3.setContents("Label3");
        label3.setOverflow(Overflow.AUTO);
        label3.setPadding(10);
        section3.addItem(label3);
 
        sectionStack.addSection(section1);
        sectionStack.addSection(section2);
        sectionStack.addSection(section3);
         
        this.addMember(sectionStack);
    }
}
