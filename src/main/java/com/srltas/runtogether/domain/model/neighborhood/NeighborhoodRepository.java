package com.srltas.runtogether.domain.model.neighborhood;

import java.util.Optional;

public interface NeighborhoodRepository {
	Optional<Neighborhood> findByName(String name);
}
