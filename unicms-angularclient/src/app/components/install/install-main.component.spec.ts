import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InstallMainComponent } from './install-main.component';

describe('InstallMainComponent', () => {
  let component: InstallMainComponent;
  let fixture: ComponentFixture<InstallMainComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InstallMainComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InstallMainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
