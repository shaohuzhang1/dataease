package io.dataease.provider;

import io.dataease.base.domain.DatasetTableField;
import io.dataease.controller.request.chart.ChartExtFilterRequest;
import io.dataease.dto.chart.ChartViewFieldDTO;

import java.util.List;

/**
 * @Author gin
 * @Date 2021/5/17 2:42 下午
 */
public abstract class QueryProvider {
    public abstract Integer transFieldType(String field);

    public abstract String createQueryCountSQL(String table);

    public abstract String createQueryCountSQLAsTmp(String sql);

    public abstract String createSQLPreview(String sql, String orderBy);

    public abstract String createQuerySQL(String table, List<DatasetTableField> fields);

    public abstract String createQuerySQLAsTmp(String sql, List<DatasetTableField> fields);

    public abstract String createQuerySQLWithPage(String table, List<DatasetTableField> fields, Integer page, Integer pageSize, Integer realSize);

    public abstract String createQuerySQLAsTmpWithPage(String sql, List<DatasetTableField> fields, Integer page, Integer pageSize, Integer realSize);

    public abstract String getSQL(String table, List<ChartViewFieldDTO> xAxis, List<ChartViewFieldDTO> yAxis, List<ChartExtFilterRequest> extFilterRequestList);

    public abstract String getSQLAsTmp(String table, List<ChartViewFieldDTO> xAxis, List<ChartViewFieldDTO> yAxis, List<ChartExtFilterRequest> extFilterRequestList);

    public abstract String searchTable(String table);
}