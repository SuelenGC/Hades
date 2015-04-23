package br.com.hades.dao;

import javax.transaction.Transactional;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:persistence.xml" })
//@Transactional("yourTransactionManager")
//public class ContratanteDaoTest extends AbstractTransactionalJUnit4SpringContextTests{
//
//}

//public class ContratanteDaoTest extends EasyMockSupport {
//	
//	@Rule
//    public EasyMockRule rule = new EasyMockRule(this);
//	
//	@Mock
//	private Contratante contratante;
//	@Mock
//	EntityManagerFactory factory;
//	@Mock
//	EntityManager em;
//	
//	@TestSubject
//	ContratanteDao dao;
//	
//	@Before
//	public void setUp() {
//		expect(factory.)
//		dao = ContratanteDao();
//	}
//
//	
//	@Test
//	public boolean testaExisteUsuario() {
//		
//	}
//			try {
//				Contratante contratanteEncontrado = em.find(Contratante.class, contratante.getId());
//				return contratanteEncontrado == null ? false : true;
//			} catch (Exception e) {
//				throw new RuntimeException(e);
//			}
//			ContratanteDao d = instancia();
//			
//		}
//		
//		public void inserir(Contratante contratante) {
//			em.persist(contratante);
//		}
//		
//		public void atualizar(Contratante contratante) {
//			em.merge(contratante);
//		}
//		
//		public void remover(Contratante contratante) {
//			em.remove(contratante);
//		}
//		
//		private void close() {
//			em.close();
//		}
//	}
//}
