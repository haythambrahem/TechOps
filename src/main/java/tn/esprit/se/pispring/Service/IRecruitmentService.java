package tn.esprit.se.pispring.Service;

import tn.esprit.se.pispring.entities.Recruitment;
import tn.esprit.se.pispring.entities.RecruitmentStatus;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IRecruitmentService {
    Recruitment addOrUpdateRecruitment(Recruitment R);

    void removeRecruitment(Long offerId);

    Recruitment retrieveRecruitment(Long offerId);

    List<Recruitment> retrieveAllRecruitments();

    List<String> getPostTitles();

    Optional<Recruitment> getPostTitleDetails(String postTitle);

    double calculateAverageSalaryRange();

    Map<String, Integer> getRecruitmentsPerHiringManager();

    Map<String, Integer> getOpenPositionsByLocation();

    Map<String, Map<RecruitmentStatus, Integer>> analyzeRecruitmentTrend(int startYear, int endYear);
}
