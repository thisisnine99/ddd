package com.korea.MOVIEBOOK.review;

import com.korea.MOVIEBOOK.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
//    List<com.korea.MOVIEBOOK.dramaReview.Review> findByDramaId(Long dramaId);
//    Page<com.korea.MOVIEBOOK.dramaReview.Review> findByDramaId(Long dramaId, Pageable pageable);
    List<Review> findReviewsByMovieId(Long id);

    List<Review> findReviewsByWebtoonId(Long webtoonId);

    Long countByMember(Member member);
}
