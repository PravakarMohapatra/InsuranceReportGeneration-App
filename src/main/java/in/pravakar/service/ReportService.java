package in.pravakar.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import in.pravakar.entity.CitizenPlan;
import in.pravakar.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatuses();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();

}
