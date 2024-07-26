package src.app.staff.administration;

import org.springframework.beans.factory.annotation.Autowired;
import src.app.staff.specialists.Secretary;

public class Director {
  @Autowired
  private Secretary secretary;
  @Autowired
  private ProductionChief productionChief;
  @Autowired
  private SalesChief salesChief;

  public void setSecretary(Secretary secretary) {
    this.secretary = secretary;
  }

  public void setProductionChief(ProductionChief productionChief) {
    this.productionChief = productionChief;
  }

  public void setSalesChief(SalesChief salesChief) {
    this.salesChief = salesChief;
  }
  public void managerCompany(){
    secretary.work();
    salesChief.giveOrders();
    productionChief.giveOrders();
  }
}
