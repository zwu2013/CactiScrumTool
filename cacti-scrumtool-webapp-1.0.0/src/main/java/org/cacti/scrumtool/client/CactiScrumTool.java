package org.cacti.scrumtool.client;

import org.cacti.scrumtool.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;


import com.smartgwt.client.widgets.layout.HLayout;  
import com.smartgwt.client.widgets.layout.VLayout;  

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CactiScrumTool implements EntryPoint {
  /**
   * The message displayed to the user when the server cannot be reached or
   * returns an error.
   */
  private static final String SERVER_ERROR = "An error occurred while "
      + "attempting to contact the server. Please check your network "
      + "connection and try again.";
  
  private static final String SERVER_ERROR_II = "An error occurred while "
	      + "attempting to contact the server. Please check your network "
	      + "connection and try again.";
  
  private static final String SERVER_ERROR_III = "An error occurred while "
	      + "attempting to contact the server. Please check your network "
	      + "connection and try again.";
  
  private static final int HEADER_HEIGHT = 85;

  private VLayout mainLayout;
  private HLayout northLayout;
  private HLayout southLayout;
  private VLayout eastLayout;
  private HLayout westLayout;
      
  public void onModuleLoad() 
  {
      Window.enableScrolling(false);
      Window.setMargin("0px");
       
      // main layout occupies the whole area
      mainLayout = new VLayout();
      mainLayout.setWidth100();
      mainLayout.setHeight100();

      northLayout = new HLayout();
      northLayout.setHeight(HEADER_HEIGHT);

      VLayout vLayout = new VLayout();
      vLayout.addMember(new HeaderArea());
      vLayout.addMember(new ApplicationMenu());
      northLayout.addMember(vLayout);

      westLayout = new NavigationArea();
      westLayout.setWidth("15%");
       
      eastLayout = new MainArea();
      eastLayout.setWidth("85%");

      southLayout = new HLayout();
      southLayout.setMembers(westLayout, eastLayout);
      
      mainLayout.addMember(northLayout);
      mainLayout.addMember(southLayout);
      
      // add the main layout container to GWT's root panel
      RootLayoutPanel.get().add(mainLayout);
  }
}
