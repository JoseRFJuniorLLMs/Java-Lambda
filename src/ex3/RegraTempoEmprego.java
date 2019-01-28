package ex3;

public class RegraTempoEmprego extends CadeiaRegras {
   public RegraTempoEmprego() {
      super(null);
   }
   public RegraTempoEmprego(Regra next) {
      super(next);
   }

   public boolean aplicar(Cliente cli) {
      if (cli.getTempoEmpregado() > 0) {
         return aplicarProximaRegra(cli);
      }
      return false;
   }
}