package com.mendittzo.review.query.application.service;

import com.mendittzo.review.query.application.dto.ReviewListResponseDTO;
import com.mendittzo.review.query.application.dto.ReviewResponseDTO;
import com.mendittzo.review.query.domain.repository.ReviewQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewQueryService {

    private final ReviewQueryRepository reviewQueryRepository;

    @Transactional(readOnly = true)
    public ReviewListResponseDTO getReviews(Long bookId, Pageable pageable) {

        // 페이지네이션 및 정렬 적용된 리뷰 조회
        Page<ReviewResponseDTO> page = reviewQueryRepository.findReviewsByBookId(bookId, pageable);

        return ReviewListResponseDTO.builder()
                .reviewList(page.getContent())  // 페이지된 리뷰 목록
                .totalPages(page.getTotalPages())  // 전체 페이지 수
                .totalElements(page.getTotalElements())  // 전체 리뷰 수
                .currentPage(page.getNumber() + 1)  // 현재 페이지 (1-based)
                .pageSize(page.getSize())  // 한 페이지의 리뷰 수
                .build();
    }
}
