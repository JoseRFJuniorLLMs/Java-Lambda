package lambda;

public class CidsEntidade
{
   private String cdis;

   // constructor
   public CidsEntidade(String cdis)
   {
      this.cdis = cdis;
   }

   // set cids
   public void setCdis(String cdis)
   {
      this.cdis = cdis;
   }

   // get cids
   public String getCdis()
   {
      return cdis;
   }

   @Override
   public String toString() {
      return "CidsEntidade{" +
              "cdis='" + cdis + '\'' +
              '}';
   }
}

