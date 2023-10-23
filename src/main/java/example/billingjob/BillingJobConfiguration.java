package example.billingjob;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BillingJobConfiguration {
	
	//docker pull postgres:14-alpine
	//docker run --name some-postgres -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:14-alpine
	//docker exec -it some-postgres psql -U postgres 
	
	// copy to container ... and sql files too
	// docker cp D:/Code/Java/BillingJob/scripts/drop-create-database.sh some-postgres:/mnt/drop-create-database.sh

//	docker exec some-postgres psql -f /mnt/schema-drop-postgresql.sql -U postgres
//	docker exec some-postgres psql -f /mnt/schema-postgresql.sql -U postgres
	
	@Bean
	public Job job(JobRepository jobRepository) {
		return new BillingJob(jobRepository);
	}
}