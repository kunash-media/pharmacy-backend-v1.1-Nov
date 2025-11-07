package com.gn.pharmacy.service;

import com.gn.pharmacy.dto.request.BannerRequestDto;
import com.gn.pharmacy.dto.response.BannerResponseDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BannerService {

    BannerResponseDto createBanner(BannerRequestDto dto, List<MultipartFile> bannerFileSlides, MultipartFile bannerFileTwo, MultipartFile bannerFileThree, MultipartFile bannerFileFour) throws Exception;

    BannerResponseDto getBannerById(Long bannerId);

    List<BannerResponseDto> getAllBanners();

    BannerResponseDto updateBanner(Long bannerId, BannerRequestDto dto, List<MultipartFile> bannerFileSlides, MultipartFile bannerFileTwo, MultipartFile bannerFileThree, MultipartFile bannerFileFour) throws Exception;

    void deleteBanner(Long bannerId);

    byte[] getBannerSlideImage(Long bannerId, int index);

    byte[] getBannerFileTwoImage(Long bannerId);

    byte[] getBannerFileThreeImage(Long bannerId);

    byte[] getBannerFileFourImage(Long bannerId);

    BannerResponseDto getBannerByPageName(String pageName);
}