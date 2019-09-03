import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SelectBackendComponent } from './select-backend.component';

describe('SelectBackendComponent', () => {
  let component: SelectBackendComponent;
  let fixture: ComponentFixture<SelectBackendComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SelectBackendComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SelectBackendComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
