package raghupathylechm.searchbar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import raghupathylechm.searchbar.entities.WineLabel;

public interface WineLabelRepo extends JpaRepository<WineLabel, Integer> {
}
