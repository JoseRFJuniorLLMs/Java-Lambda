package ex3;

public class RegraPagamentoAtraso extends CadeiaRegras {
   public RegraPagamentoAtraso() {
      super(null);
   }
   
   public RegraPagamentoAtraso(Regra next) {
      super(next);
   }

   public boolean aplicar(Cliente cli) {
      if (!cli.temPagamentosAtraso()) {
         return aplicarProximaRegra(cli);
      }
      return false;
   }
}