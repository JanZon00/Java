import java.util.List;
import java.util.function.Supplier;

public interface KasjerInterface {
	
	public List<Pieniadz> rozlicz(int cena, List<Pieniadz> pieniadze);

	public List<Pieniadz> stanKasy();

	public void dostępDoRozmieniacza(RozmieniaczInterface rozmieniacz);

	public void dostępDoPoczątkowegoStanuKasy(Supplier<Pieniadz> dostawca);
}