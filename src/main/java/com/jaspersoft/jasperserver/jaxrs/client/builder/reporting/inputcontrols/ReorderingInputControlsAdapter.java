package com.jaspersoft.jasperserver.jaxrs.client.builder.reporting.inputcontrols;

import com.jaspersoft.jasperserver.dto.reports.inputcontrols.ReportInputControlsListWrapper;
import com.jaspersoft.jasperserver.jaxrs.client.builder.JerseyRequestBuilder;
import com.jaspersoft.jasperserver.jaxrs.client.builder.OperationResult;
import com.jaspersoft.jasperserver.jaxrs.client.builder.SessionStorage;

public class ReorderingInputControlsAdapter extends InputControlsAdapter {

    public ReorderingInputControlsAdapter(SessionStorage sessionStorage, String reportUnitUri) {
        super(sessionStorage, reportUnitUri);
    }

    public OperationResult<ReportInputControlsListWrapper> reorder(ReportInputControlsListWrapper inputControls){
        JerseyRequestBuilder<ReportInputControlsListWrapper> builder =
                new JerseyRequestBuilder<ReportInputControlsListWrapper>(sessionStorage, ReportInputControlsListWrapper.class);
        builder
                .setPath("reports")
                .setPath(reportUnitUri)
                .setPath("inputControls");
        return builder.put(inputControls);
    }

}
