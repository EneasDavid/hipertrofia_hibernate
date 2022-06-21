package hipertrofia.br.com.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hipertrofia.br.com.modelo.Cartao;
import hipertrofia.br.com.modelo.Pedido;
import hipertrofia.br.com.modelo.Produto;

public class hipertrofiaDAO {
	//Produto
	//1. Cadastro
	public static String cadastrarProduto(Produto produto) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("hipertrofia-conexao");//Fabrica de conexão
		EntityManager em = emf.createEntityManager();//gerenciador
		em.getTransaction().begin();
		try {
			em.persist(produto);
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		
		em.close();
		em.getTransaction().commit();
		return "Produto cadastrado";
		}
	//2. Listar
	public static Produto listarProduto() {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("hipertrofia-conexao");//Fabrica de conexão
		EntityManager em = emf.createEntityManager();//gerenciador
		em.getTransaction().begin();
		Produto estoque=null;
		try {
			estoque= em.find(Produto.class,1);
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		
		em.close();
		em.getTransaction().commit();
		return estoque;
		}
	//3. Remover
	public static String removerProduto(int idProduto) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("hipertrofia-conexao");//Fabrica de conexão
		EntityManager em = emf.createEntityManager();//gerenciador
		em.getTransaction().begin();
		try {
			Produto remover = em.find(Produto.class, idProduto);
			em.remove(remover);
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		
		em.close();
		em.getTransaction().commit();
		return "Produto removido";
		}
	//4. Atualizar
	public static String atualizarProduto(Produto produto) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("hipertrofia-conexao");//Fabrica de conexão
		EntityManager em = emf.createEntityManager();//gerenciador
		em.getTransaction().begin();
		try {
			em.merge(produto);
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		
		em.close();
		em.getTransaction().commit();
		return "Produto atualizado";
		}

	//Cartão
		public static String cadastrarCartao(Cartao cartao) {
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("hipertrofia-conexao");//Fabrica de conexão
			EntityManager em = emf.createEntityManager();//gerenciador
			em.getTransaction().begin();
			try {
				em.persist(cartao);
			} catch (Exception e) {
				em.getTransaction().rollback();
				e.printStackTrace();
			}
			
			em.close();
			em.getTransaction().commit();
			return "Cadastro concluido";
			}
		public static Cartao listarCartao() {
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("hipertrofia-conexao");//Fabrica de conexão
			EntityManager em = emf.createEntityManager();//gerenciador
			em.getTransaction().begin();
			Cartao carteira=null;
			try {
				carteira= em.find(Cartao.class,1);
			} catch (Exception e) {
				em.getTransaction().rollback();
				e.printStackTrace();
			}
			
			em.close();
			em.getTransaction().commit();
			return carteira;
			}
	//Pedido
	public static String cadastrarPedido(Pedido pedido) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("hipertrofia-conexao");//Fabrica de conexão
		EntityManager em = emf.createEntityManager();//gerenciador
		em.getTransaction().begin();
		try {
			em.persist(pedido);
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		
		em.close();
		em.getTransaction().commit();
		return "Cadastro concluido";
		}
	public static Pedido listarPedido() {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("hipertrofia-conexao");//Fabrica de conexão
		EntityManager em = emf.createEntityManager();//gerenciador
		em.getTransaction().begin();
		Pedido ordem=null;
		try {
			ordem= em.find(Pedido.class,1);
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		
		em.close();
		em.getTransaction().commit();
		return ordem;
		}
}
