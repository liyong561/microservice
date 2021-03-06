/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.openapigenerator.rest;

import com.example.openapigenerator.rest.dto.CreateCourseRequest;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-03T22:20:10.567+08:00[Asia/Shanghai]")

@Validated
@Api(value = "courses", description = "the courses API")
public interface CoursesApi {

    default CoursesApiDelegate getDelegate() {
        return new CoursesApiDelegate() {};
    }

    @ApiOperation(value = "创建专辑课程", nickname = "createCourse", notes = "需要在主站创建专辑，此时状态为【编辑中】", response = CreateCourseRequest.class, tags={ "Courses", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "操作成功", response = CreateCourseRequest.class),
        @ApiResponse(code = 404, message = "服务未找到", response = String.class) })
    @RequestMapping(value = "/courses",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<CreateCourseRequest> createCourse(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreateCourseRequest createCourseRequest) {
        return getDelegate().createCourse(createCourseRequest);
    }

}
