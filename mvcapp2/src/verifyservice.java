import org.springframework.jdbc.core.JdbcTemplate;


public class verifyservice {
	JdbcTemplate jt;
	public void setJt(JdbcTemplate jt){
		this.jt=jt;
		
	}
	public int verifydata(String u,String p){
		int m=0;
		m=jt.queryForInt("select count(*)from springusers where uname='"+u+"'and pwd='"+p+"'");
		return m;
	

}
}